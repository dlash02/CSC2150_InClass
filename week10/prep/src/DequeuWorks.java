import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuWorks {
    public static void main(String[] args) {
        // Create a Deque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the end of the deque (like a queue)
        deque.addLast("Element 1");
        deque.addLast("Element 2");
        deque.addLast("Element 3");
        System.out.println("Deque after adding elements at the end: " + deque);

        // Add elements to the front of the deque (useful for stack behavior)
        deque.addFirst("Element 0");
        System.out.println("Deque after adding an element at the front: " + deque);

        // Remove elements from the front
        String first = deque.removeFirst();
        System.out.println("Removed from front: " + first);
        System.out.println("Deque after removing from the front: " + deque);

        // Remove elements from the end
        String last = deque.removeLast();
        System.out.println("Removed from end: " + last);
        System.out.println("Deque after removing from the end: " + deque);

        // Peek at elements without removing them
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();
        System.out.println("First element: " + peekFirst);
        System.out.println("Last element: " + peekLast);

        // Use the deque as a stack
        deque.push("New Element");
        System.out.println("Deque after push (stack behavior): " + deque);

        // Pop the top element (stack behavior)
        String popped = deque.pop();
        System.out.println("Popped from stack: " + popped);
        System.out.println("Deque after pop: " + deque);
    }
}
