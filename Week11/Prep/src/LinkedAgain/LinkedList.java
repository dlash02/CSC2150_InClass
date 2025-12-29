package LinkedAgain;

public class LinkedList {
    Node head;
    void show() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public void insertAtEnd( int val ){
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
    boolean removeValue(int target) {
        if (head == null) return false;        // empty list
        if (head.data == target) {             // target is at head
            head = head.next;
            return true;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.data == target) {         // found target
                prev.next = curr.next;         // unlink node
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;                          // not found
    }
}
