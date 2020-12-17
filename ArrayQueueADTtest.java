package Prak11;

public class ArrayQueueADTtest {
    public static void main(String[] args){
        ArrayQueueADT queue = new ArrayQueueADT();
        for(int i=0;i<10;i++){
            queue.enqueue(queue,i);
        }
        System.out.println(queue.element(queue));
        System.out.println(queue.size(queue));
        System.out.println(queue.dequeue(queue));
        System.out.println(queue.size(queue));
        System.out.println(queue.dequeue(queue));
        System.out.println(queue.isEmpty(queue));
        while(!queue.isEmpty(queue)){
            System.out.println(queue.dequeue(queue));
        }
        System.out.println(queue.isEmpty(queue));
    }
}
