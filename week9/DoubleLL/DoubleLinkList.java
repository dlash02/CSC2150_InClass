package DoubleLL;

public class DoubleLinkList {
    Node head, tail = null;
    int size = 0;
    public DoubleLinkList() {
    }
    public void addNode( String item ){
        Node newNode = new Node(item);
        if ( head == null ){
            // first node
            head = newNode;
            tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            // Add it to the back
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void printAllNode(){
        Node current = head;
        if ( current == null ){
            System.out.printf("\n Empty DLL");
        } else {
            while ( current != null ){
                System.out.printf("\n %s",current.item);
                current = current.next;
            }
        }
    }
    public void printAllReverse() {
        // ToDo Make that happen
    }
    public Node removeLastItem(){
        Node previous = tail.previous;
        previous.next = null;
        Node oldTail = tail;
        tail = previous;
        return oldTail;
    }
}
