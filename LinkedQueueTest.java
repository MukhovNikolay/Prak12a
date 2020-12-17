package Prak11;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        System.out.println(queue.isEmpty());
    }
}
