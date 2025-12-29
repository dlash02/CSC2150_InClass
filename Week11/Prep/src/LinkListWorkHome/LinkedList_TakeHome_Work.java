package LinkListWorkHome;


class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}
// LinkedList_TakeHome_Quiz.java
// Take-home quiz: complete the two TODO methods below.
// Name: ______________________    Date: ____________
public class LinkedList_TakeHome_Work {
    Node head;

    // Provided helper to add a node at the end.
    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Provided print helper
    void show() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    /**
     * TODO #1
     * Complete countDuplicateNodes().
     * Returns the number of nodes that contain values that appear
     * more than once in the list.
     * Example: 4 → 8 → 4 → 2 → 8 → null  →  returns 4
     */
    public int countDuplicateNodes() {
        // TODO: declare a counter for duplicates
        // TODO: outer loop: traverse list with 'curr'
        // TODO: inner loop: use a 'runner' to check nodes after curr
        // TODO: if a duplicate value is found, increment counter (once per curr)
        // TODO: move curr to the next node
        // TODO: return the count
        return 0; // placeholder so code compiles
    }

    /**
     * TODO #2
     * Complete findNodeAfter(int value).
     * Returns the value stored in the node immediately AFTER
     * the first node containing 'value'.
     * If value not found or is last node, return -1.
     */
    public int findNodeAfter(int value) {
        // TODO: start traversal from head
        // TODO: while list not finished
        //        if current node matches 'value'
        //            if current.next exists, return its data
        //            else return -1
        //        move to next node
        // TODO: return -1 if value never found
        return -1; // placeholder
    }

    public static void main(String[] args) {
        LinkedList_TakeHome_Work list = new LinkedList_TakeHome_Work();

        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(4);
        list.insertAtEnd(2);
        list.insertAtEnd(8);
        list.insertAtEnd(9);

        list.show(); // Expected: 4 8 4 2 8 9

        // Students can use these for testing
        System.out.println("Duplicate node count: " + list.countDuplicateNodes());
        System.out.println("Value after 8: " + list.findNodeAfter(8));
        System.out.println("Value after 9: " + list.findNodeAfter(9));
        System.out.println("Value after 5: " + list.findNodeAfter(5));
    }
}
