package DoubleLL;

public class DriveMyDLL {
    public static void main(String[] args) {
        DoubleLinkList dll = new DoubleLinkList();
        dll.addNode("Apples");
        dll.addNode("Baker");
        dll.addNode("Charlie");
        dll.addNode("Dog");
        dll.printAllNode();
        Node gone = dll.removeLastItem();
        System.out.printf("\n It is gone:%s", gone.item);
        dll.printAllNode();
    }
}
