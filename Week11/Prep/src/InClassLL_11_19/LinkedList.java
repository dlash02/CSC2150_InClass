package InClassLL_11_19;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    // ToDo Write a main method that adds 4 nodes.
    // ToDo: add a method in this class to print ALL nodes
    // ToDO: print all all out
    // ToDo: remove a value
    // ToDo: print all out
    public void insertAtEnd( int val ){
        // 1. Create a node
        // 2. Find where to put it
        // 3. Link it in
//        Node newNode = new Node( val );
        Node newNode = new Node();
        newNode.setValue( val );
//        newNode.value = val;
        if ( head == null ){
            head = newNode;
        } else {
              Node current = head;
              while ( current.next != null ){
                  current = current.next;
              }
              current.next = newNode;
        }
    }
    public boolean removeValue ( int target){
        //Todo Remove the first node that has this value
        if ( head == null ){
            return false;
        }
        if ( head.getValue() == target ){
            head = head.next;
            return true;
        }
        Node previous = head;
        Node curr = head.next;
        while( curr != null ){
            if ( curr.value == target ){
                previous.next = curr.next;
                return true;
            }
            previous = curr;
            curr = curr.next;
        }
        return false;
    }
    public ArrayList<Integer> getItemsReverse(){
        ArrayList<Integer> revItems = new ArrayList<>();
        // ToDo: return an ArrayList of the LL items in revers
        //   E.g., If LL was 6 -> 3 -> 1 -> 9
        //     return and arraylist with this order 9, 1, 3, 6
        return revItems;
    }
}
