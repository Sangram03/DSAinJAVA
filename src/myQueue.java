import java.util.Queue;
import java.util.LinkedList;

public class myQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);  // Inserts 10 at the end of the queue
        queue.offer(20);// Enqueue
        queue.offer(30);
        System.out.println("Queue: " + queue);
        queue.poll();  // remove first element
        System.out.println("Queue: " + queue);

        // front element in queue
        System.out.println("Queue: " + queue.peek());

//        queue.isFull();  used for fixed sizes array


        // is empty checking
        System.out.println("Queue" + queue.isEmpty());
        // size
        System.out.println("Queue" + queue.size());
        // clear
        queue.clear();
        System.out.println("Queue: " + queue);







        // Access front element
//        System.out.println("Front element: " + queue.peek());
//
//        queue.remove();
//        System.out.println("Last Element is ");
//
//        // Remove front element
//        queue.poll();
//
//        System.out.println("Queue after polling: " + queue);
    }
}
