
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeQueue{
    public static void main(String[] args)
    {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> resQ = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for (int i=0;i<n1;i++)
            q1.add(sc.nextInt());
        int n2 = sc.nextInt();
        for (int i=0;i<n2;i++)
            q2.add(sc.nextInt());
        int n3 = sc.nextInt();
        for (int i=0;i<n3;i++)
            q3.add(sc.nextInt());

        Integer max = null;
        while((max = getMax(q1,q2,q3))!=null )      {
            resQ.add(max);
        }

        while (!resQ.isEmpty())
            System.out.print(resQ.remove()+" ");
    }

    static Integer getMax (Queue<Integer>...qs)
    {
        Integer max = -1;
        int maxInd = -1;

        for (int i=0 ; i<qs.length ;i++)
        {
            if(!qs[i].isEmpty() && qs[i].peek()>max)
            {
                max= qs[i].peek();
                maxInd = i;
            }
        }
        if (maxInd ==-1 )
            return null ;
        return qs[maxInd].remove();
    }
}

