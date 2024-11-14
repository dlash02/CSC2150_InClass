import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = getPQ1();
        showMeThisPQ( pq );
        PriorityQueue<Integer> pq2 = getPQ2();
        showMeThisPQ( pq2 );

        PriorityQueue<Guest> pq3 = getPQ3();
        while( !pq3.isEmpty()){
            System.out.printf("\n Item:%s", pq3.poll().toString());
        }
    }

    private static PriorityQueue<Guest> getPQ3() {
        PriorityQueue<Guest> pq = new PriorityQueue<>();
        Guest a = new Guest("Alice", 2);
        pq.add(a);
        pq.add( new Guest("Bob", 3));
        pq.add( new Guest("Charlie", 1));
        pq.add( new Guest("Jill", 5));
        pq.add( new Guest("Jack", 1));
        return pq;
    }

    private static PriorityQueue<Integer> getPQ2() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(22);
        pq.add(100);
        pq.add(1);
        pq.add(-1);
        return pq;
    }

    private static void showMeThisPQ(PriorityQueue<Integer> pq) {
        System.out.printf("\n --------");
        while( pq.size() > 0 ){
            System.out.printf("\n %s ", pq.poll());
        }
    }

    private static PriorityQueue<Integer> getPQ1() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(20);
        pq.add(44);
        return pq;
    }
}
