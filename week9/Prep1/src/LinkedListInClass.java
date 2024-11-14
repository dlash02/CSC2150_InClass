package Prep1.src;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListInClass {
    public static void main(String[] args) {
        ArrayList<Integer> myNumber  = new ArrayList<Integer>();
        myNumber.add(1);
        myNumber.removeFirst();
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.add(1);

        myList.add(2);
        myList.add(3);
        myList.add(4);

        for( int i : myList ) {
            System.out.println(i);
        }
        int first = myList.getFirst();
        myList.removeFirst();
    }
}
