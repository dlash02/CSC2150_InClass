import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class InClass_Deque {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        Deque<String> myDeq = new ArrayDeque();
        myDeq.addFirst("Apples");
        myDeq.addFirst("Bananas");
        myDeq.addFirst("Cake");
        myDeq.addLast( "Dog");
        myDeq.addLast( "Eggs");
        showMyDeq( myDeq );
        myDeq.removeFirst();
        showMyDeq( myDeq );
        myDeq.push( "Donuts");
        showMyDeq( myDeq );
        String item = myDeq.pop();


    }

    private static void showMyDeq(Deque<String> myDeq) {
        for ( String item : myDeq ) {
            System.out.printf("\n MyItem:%s", item);
        }
    }
}
