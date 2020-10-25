package DS_Chapter1;

import java.util.Scanner;

public class Soal6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 1 ; i<=n ; i++)
        {
            list.add(i);
        }
        int m = sc.nextInt();
        for (int j =0 ; j<m ; j++)
        {
            String command = sc.next();
            if(command.equals("NAME"))
            {
                System.out.println(list.get(sc.nextInt()));
            }
            else
            {
                int l = sc.nextInt() ;
                int h = sc.nextInt() ;
                list.reverse(l, h);
            }
        }

    }
}
class Node
{
    int data ;
    Node next ;
    Node prev ;
    public Node (int x  , Node prev , Node next)
    {
        this.data = x ;
        this.next = next ;
        this.prev = prev ;
    }
}
class DoublyLinkedList
{
    Node head ;
    Node tail ;
    public DoublyLinkedList()
    {
    }
    public void add(int x)
    {
        Node newNode = new Node(x , tail , null);
        if (head == null)
        {
            head = tail = newNode ;
        }
        else
        {
            tail.next = newNode ;
            tail = newNode ;
        }
    }
    private Node getNode(int index)
    {
        int k = 1 ;
        Node t = head ;
        while(index>k)
        {
            if(t.next != null)
                t = t.next ;
            else
                throw new IndexOutOfBoundsException();
            k++ ;
        }
        return t ;

    }
    public int get(int index)
    {
        return getNode(index).data ;
    }
    public void reverse(int l , int h)
    {
        Node start = getNode(l);
        Node end = getNode(h);
        while (l<h)
        {
            int temp = start.data ;
            start.data = end.data ;
            end.data = temp ;
            l++ ;
            h-- ;
            start = start.next ;
            end = end.prev ;
        }
    }
}