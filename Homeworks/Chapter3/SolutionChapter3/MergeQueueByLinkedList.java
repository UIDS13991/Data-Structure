
import java.util.LinkedList;
import java.util.Scanner;


public class MergeQueueByLinkedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k=0;
        QueueList<Integer> numbers1 = new QueueList<>();
        QueueList<Integer> numbers2 = new QueueList<>();
        QueueList<Integer> numbers3 = new QueueList<>();
        int n = s.nextInt();
        k+=n;
        for (int i=0 ; i< n ; i++){
            numbers1.enQueue(s.nextInt());
        }
        n = s.nextInt();
        k+=n;
        for (int i=0 ; i< n ; i++){
            numbers2.enQueue(s.nextInt());
        }
        n = s.nextInt();
        k+=n;
        for (int i=0 ; i< n ; i++){
            numbers3.enQueue(s.nextInt());
        }
        QueueList<Integer> maxNumber = new QueueList<>();
        int max=0;
        for (int i=0 ; i<k ; i++){
            if (numbers1.size()==0 && numbers2.size()==0 && numbers3.size()==0){
                break;
            }
            if (numbers1.size()>0 && numbers2.size()>0 && numbers3.size()>0) {
                max = Math.max(numbers1.first(), numbers2.first());
                max = Math.max(max, numbers3.first());
                if (max == numbers1.first()){
                    maxNumber.enQueue(numbers1.deQueue());
                }
                if (max == numbers2.first()){
                    maxNumber.enQueue(numbers2.deQueue());
                }
                if (max == numbers3.first()) {
                    maxNumber.enQueue(numbers3.deQueue());
                }
            }
            else {
                if (numbers1.size() == 0 && numbers2.size()>0 && numbers3.size()>0) {
                    max = Math.max(numbers2.first(), numbers3.first());
                    if (max == numbers2.first()){
                        maxNumber.enQueue(numbers2.deQueue());
                    }
                    if (max == numbers3.first()){
                        maxNumber.enQueue(numbers3.deQueue());
                    }
                }
                if (numbers2.size() == 0 && numbers1.size()>0 && numbers3.size()>0) {
                    max = Math.max(numbers1.first(), numbers3.first());
                    if (max == numbers1.first()){
                        maxNumber.enQueue(numbers1.deQueue());
                    }
                    if (max == numbers3.first()){
                        maxNumber.enQueue(numbers3.deQueue());
                    }
                }
                if (numbers3.size() == 0 && numbers2.size()>0 && numbers1.size()>0) {
                    max = Math.max(numbers2.first(), numbers1.first());
                    if (max == numbers2.first()){
                        maxNumber.enQueue(numbers2.deQueue());
                    }
                    if (max == numbers1.first()){
                        maxNumber.enQueue(numbers1.deQueue());
                    }
                }
                if (numbers1.size()==0 && numbers2.size()==0 && numbers3.size()>0){
                    max = numbers3.first();
                    maxNumber.enQueue(numbers3.deQueue());
                }
                if (numbers1.size()==0 && numbers3.size()==0 && numbers2.size()>0){
                    max = numbers2.first();
                    maxNumber.enQueue(numbers2.deQueue());
                }
                if (numbers2.size()==0 && numbers3.size()==0 && numbers1.size()>0){
                    max = numbers1.first();
                    maxNumber.enQueue(numbers1.deQueue());
                }
            }

        }
        for (int i=0 ; i<k ; i++){
            System.out.print(maxNumber.deQueue()+" ");
        }
    }
}
interface Queue<E>{
    void enQueue(E element);
    E deQueue();
    int size();
    boolean isEmpty();
    E first();
}
class QueueList<E> implements Queue<E>{
    LinkedList<E> list = new LinkedList<>();

    @Override
    public void enQueue(E element) {
        list.addLast(element);
    }

    @Override
    public E deQueue() {
        return list.removeFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E first() {
        return list.getFirst();
    }
}