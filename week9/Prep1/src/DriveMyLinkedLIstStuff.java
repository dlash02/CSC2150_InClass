package Prep1.src;

public class DriveMyLinkedLIstStuff {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        System.out.printf("\n Size:%s", ll.getSize());
        ll.addNode("Apples");
        System.out.printf("\n Size2:%s", ll.getSize());
        ll.addNode("Bananas");
        ll.addNode("Cookies");
        System.out.printf("\n Size3:%s", ll.getSize());
        Node head = ll.getHead();
        showMyList( head );

        if ( ll.doesContain("bananas!") ){
            System.out.printf("\n Yes we got some bananas!");
        } else {
            System.out.printf("\n No Bananas! for you");
        }
        Node n = ll.removeThisItem("cookies");
        showMyList( ll.getHead() );
    }

    private static void showMyList(Node head) {
        Node tempNode = head;
        int ct = 0;
        while ( tempNode != null ) {
            System.out.printf("\n Ct:%s Node:%s", ct++, tempNode.value);
            tempNode = tempNode.next;
        }

    }
}
