package Prak11;

public class ArrayQueueTest {
    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue();
        for(int i=0;i<10;i++){
            queue.enqueue(i);
        }
        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        System.out.println(queue.isEmpty());
    }
}
