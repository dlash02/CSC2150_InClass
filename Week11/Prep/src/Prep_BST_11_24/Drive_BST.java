package Prep_BST_11_24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public class Drive_BST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.addNode(10, "apples");
        bst.addNode( 20, "Bananas");
        bst.addNode( 5, "Cake");
        bst.addNode( 15, "Donuts");

        BSTNode n = bst.findNode( 15 );

        System.out.printf("\n Got node key:%s v:%s", n.key, n.name);
        System.out.printf("\n -------------------");
        BSTNode smallest = bst.findTheSmallest(bst.root);
        System.out.printf("\n Got node key:%s v:%s", smallest.key, smallest.name);

        System.out.printf("\n Is Balananced:%s", bst.isBalanced());

        System.out.printf("\n Some of key:%s", sumBT(bst.root));
        System.out.printf("\n All nodes add sum:%s", addBT(bst.root));
    }
    /* Function to find sum of all the elements*/
    static int addBT(BSTNode root) {
        if (root == null)
            return 0;
        return (root.key + addBT(root.leftChild) +
                addBT(root.rightChild));
    }
    // The main function to check if a given binary tree is height-balanced or not
    static int sumBT(BSTNode root) {
        // sum variable to track the sum of
        // all variables.
        int sum = 0;

        Queue<BSTNode> q = new LinkedList<BSTNode>();

        // Pushing the first level.
        q.add(root);

        // Pushing elements at each level from
        // the tree.
        while (!q.isEmpty()) {
            BSTNode temp = q.poll();

            // After popping each element from queue
            // add its data to the sum variable.
            sum += temp.key;

            if (temp.leftChild != null) {
                q.add(temp.leftChild);
            }
            if (temp.rightChild != null) {
                q.add(temp.rightChild);
            }
        }
        return sum;
    }
}
