package Prak11;

import java.util.Arrays;

public class ArrayQueueADT {
    private int dimension = 0;
    private Object [] elements = new Object[5];
    public void enqueue(ArrayQueueADT queue, Object elem){
        capacity(queue,queue.dimension+1);
        queue.elements[dimension++]=elem;
    }
    private void capacity(ArrayQueueADT queue, int capacity){
        if(capacity > queue.elements.length)
            queue.elements = Arrays.copyOf(queue.elements,capacity*2);
    }
    public Object element(ArrayQueueADT queue){
        return queue.elements[0];
    }
    public Object dequeue(ArrayQueueADT queue){
        Object a = queue.elements[0];
        for(int i=0;i<queue.dimension;i++){
            queue.elements[i] = queue.elements[i+1];
        }
        queue.dimension--;
        return a;
    }
    public int size(ArrayQueueADT queue){
        return queue.dimension;
    }
    public boolean isEmpty(ArrayQueueADT queue){
        return queue.dimension==0;
    }
    public void clear(ArrayQueueADT queue){
        for(int i=0;i<queue.dimension;i++){
            queue.elements[i] = null;
        }
        queue.dimension = 0;
    }
}
