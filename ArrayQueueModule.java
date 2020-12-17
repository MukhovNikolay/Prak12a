package Prak11;

import java.util.Arrays;

public class ArrayQueueModule  {
    private static Object[] queue = new Object[5];
    private static int size = 0;
public static void enqueue (Object elem) {
    if (elem != null) {
        capacity(size+1);
        queue[size++] = elem;
    }
}
private static void capacity(int capacity){
    if(capacity>queue.length)
        queue = Arrays.copyOf(queue,2*capacity);
}
public static Object element(){
    return queue[0];
    }
public static Object dequeue(){
    Object a = queue[0];
    for(int i=0;i<size;i++){
       queue[i] = queue[i+1];
    }
    size--;
    return a;
}
public static int size(){
    return size;
    }
public static boolean isEmpty(){
    return size==0;
}
public static void clear(){
    for(int i=0;i<size;i++){
        queue[i]=null;
    }
    size = 0;
}
}
