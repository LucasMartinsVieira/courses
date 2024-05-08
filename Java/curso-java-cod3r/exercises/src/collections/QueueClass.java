package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Offer and Add -> They both add elements into the queue.
        queue.add("Ana"); // throws an exception
        queue.offer("Bia"); // retuns false
        queue.offer("Carlos");
        queue.offer("Daniel");
        queue.offer("Rafaela");
        queue.offer("Guilherme");

        // Peek and Element -> They both get the next element in the queue (without removing)
        // When the queue is empty!
        System.out.println(queue.peek()); // returns null
        System.out.println(queue.peek());
        System.out.println(queue.element()); // Throws an exception
        System.out.println(queue.element());

        // When the queue is empty
        System.out.println(queue.poll()); // return null
        System.out.println(queue.remove()); // Throws an Exception
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

//        queue.size();
//        queue.isEmpty();
//        queue.clear();
//        queue.contains();
    }
}
