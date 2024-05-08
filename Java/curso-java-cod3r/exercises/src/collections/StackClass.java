package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackClass {
    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<>();

        books.add("Thinking Fast and Slow");
        books.push("Why we Sleep");
        books.push("The Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.pop());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.pop());
//        System.out.println(books.remove());

//        books.size();
//        books.clear();
//        books.contains();
//        books.isEmpty();
    }
}
