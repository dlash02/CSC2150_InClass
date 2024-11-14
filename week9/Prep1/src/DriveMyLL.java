package Prep1.src;

public class DriveMyLL {
    public static void main(String[] args) {
       Node first = new Node( "Apples");
       Node second = new Node( "Banana");
       first.next = second;
        Node third = new Node( "Cake");
        second.next = third;
        Node fourth = new Node( "Donuts");
        third.next = fourth;
        showMeTheNodes( first );

//        System.out.printf("Using First to get second->");
//        String secondV   = first.next.value;
//        Node theSecondNode = first.next;
//        System.out.println(secondV);
    }

    private static void showMeTheNodes(Node head) {
        Node current = head;
        int ct = 1;
        while (current != null) {
            System.out.printf("\n ct:%s V:%s", ct++,
                    current.value);
            current = current.next;
        }
    }
}
