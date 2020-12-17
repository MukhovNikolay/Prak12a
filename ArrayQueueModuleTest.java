package Prak11;

public class ArrayQueueModuleTest {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            ArrayQueueModule.enqueue(i);
        }
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.isEmpty());
        while(!ArrayQueueModule.isEmpty()){
            System.out.println(ArrayQueueModule.dequeue());
        }
        System.out.println(ArrayQueueModule.isEmpty());
    }
}
