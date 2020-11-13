

import java.util.Scanner;

public class Wire
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int x0 = sc.nextInt() ;
        int y0 = sc.nextInt();
        Point max10 = new Point(x0,y0);
        Point max01 = new Point(x0,y0);
        Point max11 = new Point(x0,y0);
        Point min = new Point(x0,y0);

        for (int i = 1 ; i<n ;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt() ;
            if ( (x-y) > (max10.x - max10.y))
            {
                max10.x = x ;
                max10.y = y ;
            }
            if ( (y-x) > (max01.y -max01.x))
            {
                max01.x = x ;
                max01.y = y ;
            }
            if ( (x+y)>(max11.x + max11.y))
            {
                max11.x = x ;
                max11.y = y ;
            }
            if ( (x+y) < (min.x + min.y ))
            {
                min.x = x ;
                min.y = y ;
            }
        }
        int max = maxDist(max01 , max10 , max11 , min) ;
        System.out.println(max);

    }
    static int getDist (Point p1 , Point p2)
    {
        return (Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y));
    }
    static int maxDist(Point...ar)
    {
        int max = 0 ;
        for (int i = 0 ; i<ar.length-1 ;i++)
        {
            for (int j = i+1 ; j<ar.length ; j++)
            {
                int newDist = getDist(ar[i], ar[j]);
                if (newDist>max)
                    max = newDist ;
            }
        }
        return max ;
    }

}

class Point
{
    int x, y;
    public Point(int x ,int y)
    {
        this.x = x ;
        this.y = y ;
    }
    public String toString()
    {
        return (x+" "+y);
    }
}
