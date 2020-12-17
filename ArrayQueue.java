package Prak11;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue{
    private Object[] queue = new Object[5];
    private int size = 0;
    public void enqueue (Object elem) {
        if (elem != null) {
            capacity(size+1);
            queue[size++] = elem;
        }
    }
    private void capacity(int capacity){
        if(capacity>queue.length)
            queue = Arrays.copyOf(queue,2*capacity);
    }
    public Object element(){
        return queue[0];
    }
    public Object dequeue(){
        Object a = queue[0];
        for(int i=0;i<size;i++){
            queue[i] = queue[i+1];
        }
        size--;
        return a;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void clear(){
        for(int i=0;i<size;i++){
            queue[i]=null;
        }
        size = 0;
    }
}
