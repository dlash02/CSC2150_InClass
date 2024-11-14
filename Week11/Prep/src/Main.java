import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = getPQ1();
        showPQ( pq );
        PriorityQueue<Integer> pq2 = getPQ2();

        PriorityQueue<Guest> pq3 = getPQ3();
        System.out.printf("\n -------");
        ArrayDeque<Object> guestQueue;
        while (!pq3.isEmpty()) {
            System.out.println(pq3.poll()); // Retrieves and removes guests by priority
        }
    }

    private static PriorityQueue<Guest> getPQ3() {
        PriorityQueue<Guest> guestQueue = new PriorityQueue<>();
        guestQueue.add(new Guest("Alice", 2));
        guestQueue.add(new Guest("Bob", 1));
        guestQueue.add(new Guest("Charlie", 3));
        return guestQueue;
    }

    private static PriorityQueue<Integer> getPQ2() {
        PriorityQueue<Integer> pq = new PriorityQueue<>( Comparator.reverseOrder());
        pq.add(100);
        pq.add(20);
        pq.add(44);
        return pq;
    }

    private static void showPQ(PriorityQueue<Integer> pq) {
        System.out.printf("\n ---------------------");
        while ( pq.size() > 0 ) {
            System.out.println(pq.poll());
        }
    }

    private static PriorityQueue<Integer> getPQ1() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        new PriorityQueue<>();
        pq.add(100);
        pq.add(20);
        pq.add(44);
        return pq;
    }

}