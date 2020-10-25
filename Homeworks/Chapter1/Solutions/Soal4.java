 package DS_Chapter1 ;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigNumber c = BigNumber.add(new BigNumber(s.next()),new BigNumber(s.next()));
        System.out.println(c.toString());
    }
}
class BigNumber {
    private int[] huge = new int[33];
    private int length;
    public BigNumber() { }
    public BigNumber(String s) {
        length = s.length();
        int i = 33;
        int j = s.length();
        while (j != 0) {
            i--; j--;
            this.huge[i] = s.charAt(j) - 48;
        }
    }

    public static BigNumber add(BigNumber a, BigNumber b) {
        BigNumber c = new BigNumber();
        if (a.length > b.length)
            c.length = a.length;
        else
            c.length = b.length;

        for (int i = 32; i >= 0; i--) {
            if (a.huge[i] + b.huge[i] > 9 && i != 0 && i != 33 - c.length) {
                c.huge[i] = a.huge[i] + b.huge[i] - 10;
                a.huge[i - 1]++;
            } else
                c.huge[i] = a.huge[i] + b.huge[i];
        }
        return c;
    }

    public boolean isZero(){
        for (int i = 0; i < 33; i++) {
            if(this.huge[i] != 0)
                return false;
        }
        return true;
    }

    public String toString() {
        if (this.isZero())
            return "0";
        for (int i = 0; i < 33; i++) {
            if (this.huge[i] != 0) {
                this.length = 33 - i;
                break;
            }
        }
        String s = "";
        for (int i = 33 - length; i < 33; i++) {
            s += this.huge[i];
        }
        return s;
    }
}

