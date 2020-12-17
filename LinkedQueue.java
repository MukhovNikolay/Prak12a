package Prak11;

import java.util.ArrayList;

public class LinkedQueue extends AbstractQueue{
    ArrayList queue = new ArrayList();
    public void enqueue (Object elem){
        queue.add(elem);
    };
    public Object element(){
        return queue.get(0);
    };
    public Object dequeue(){
        return queue.remove(0);
    };
    public int size(){
        return queue.size();
    };
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void clear(){
        queue.clear();
    };
}
