package Prep1.src;

public class MyLinkedList {
    private Node head;
    private int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public void addNode( String itemValue ){
        if ( size == 0 ) {
            head = new Node( itemValue );
            head.next = null;
            this.size++;
            System.out.printf("\n It is a start");
        } else {
            // THere is 1 or more nodes
            Node oldHead = head;
            this.head = new Node( itemValue );
            this.head.next = oldHead;
            this.size++;
        }
    }
    public Node getHead(){
        return head;
    }
    public boolean doesContain( String itemValue ){
        boolean found = false;
        Node tempNode = head; // same as this.head
        while( tempNode != null ){
            if ( tempNode.value.equalsIgnoreCase(itemValue) ){
                found = true;
                break;
            }
            tempNode = tempNode.next;
        }
        return found;
    }
    public Node removeThisItem( String itemValue ){
        boolean found = false;
        Node thisNode = head;
        Node previousNode = null;
        while ( thisNode != null ){
            if ( thisNode.value.equalsIgnoreCase(itemValue) ){
                found = true;
                if ( previousNode == null ){
                    //means its the first node
                    this.head = head.next;
                    this.size = this.size - 1;
                    return thisNode;
                } else {
                    // found it not in the first position
                    // So previous should be previousNode
                    previousNode.next = thisNode.next;
                    this.size = this.size - 1;
                    return thisNode;
                }
            } else {
                // thisNode is Not the item we are looking for
                previousNode = thisNode;
                thisNode = thisNode.next;

            }
        }
        return null;
    }
}
