
import java.util.Scanner;
import java.util.Stack;

public class NoNameStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        Stack<String> st;
        boolean flag;
        int index;
        while (input.hasNext()) {
            s = input.nextLine();
            st = new Stack<>();
            flag = true;
            index = 0;
            for (int i = 0; i < s.length() && flag; i++) {
                switch (s.charAt(i)) {
                    case '(':
                        if (i + 1 < s.length() && s.charAt(i + 1) == '*') {
                            if (i + 2 < s.length() && s.charAt(i + 2) == ')') {
                                flag = false;
                                index++;
                            } else {
                                st.push("(*");
                                index--;
                            }
                        } else {
                            st.push("(");
                        }
                        break;
                    case '[':
                        st.push("[");
                        break;
                    case '{':
                        st.push("{");
                        break;
                    case '<':
                        st.push("<");
                        break;
                    case ')':
                        if (st.isEmpty()) {
                            flag = false;
                        } else {
                            String s2 = st.pop();
                            if (i - 1 >= 0 && s.charAt(i - 1) == '*') {
                                if (!s2.equals("(*")) {
                                    flag = false;
                                }
                                index--;
                            } else {
                                if (!s2.equals("(")) {
                                    flag = false;
                                }
                            }
                        }
                        break;
                    case ']':
                        if (st.isEmpty()) {
                            flag = false;
                        } else {
                            String s2 = st.pop();
                            if (!s2.equals("[")) {
                                flag = false;
                            }
                        }
                        break;
                    case '}':
                        if (st.isEmpty()) {
                            flag = false;
                        } else {
                            String s2 = st.pop();
                            if (!s2.equals("{")) {
                                flag = false;
                            }
                        }
                        break;
                    case '>':
                        if (st.isEmpty()) {
                            flag = false;
                        } else {
                            String s2 = st.pop();
                            if (!s2.equals("<")) {
                                flag = false;
                            }
                        }
                        break;
                }
                index++;
            }

            if (flag && st.size() > 0) {
                flag = false;
                index++;
            }
            System.out.println((flag ? "YES" : "NO " + index));
        }
    }
}
