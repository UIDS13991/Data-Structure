import java.util.Scanner;

public class MergeQueueByArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        Queue queue1 = new Queue(s1);
        for (int i = 1; i <= s1; i++) {
            queue1.enqueue(scanner.nextInt());
        }

        int s2 = scanner.nextInt();
        Queue queue2 = new Queue(s2);
        for (int i = 1; i <= s2; i++) {
            queue2.enqueue(scanner.nextInt());
        }

        int s3 = scanner.nextInt();
        Queue queue3 = new Queue(s3);
        for (int i = 1; i <= s3; i++) {
            queue3.enqueue(scanner.nextInt());
        }

        Queue ans = new Queue(s1+s2+s3);

        while (!(queue1.isEmpty() && queue2.isEmpty() && queue3.isEmpty())) {
            int max = Math.max(queue1.first(), Math.max(queue2.first(), queue3.first()));
            if (max == queue1.first()) queue1.dequeue();
            else if (max == queue2.first()) queue2.dequeue();
            else if (max == queue3.first()) queue3.dequeue();
            ans.enqueue(max);

        }
        for (int i = 1; i <= s1+s2+s3; i++) {
            System.out.print(ans.dequeue() + " ");
        }
        System.out.println();



    }
}

class Queue {
    private int[] elements;
    private int size;
    private int f;
    private int e;

    public Queue(int capacity) {
        elements = new int[capacity];
        f = 0;
        e = 0;
        size = 0;
    }

    public void enqueue(int n) {
        elements[e] = n;
        e++;
        size++;
    }

    public int dequeue() {
        size--;
        int e = elements[f];
        f++;
        return e;
    }

    public int first() {
        if (f < e) {
            return elements[f];
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
