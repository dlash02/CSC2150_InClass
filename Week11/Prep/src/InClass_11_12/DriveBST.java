package InClass_11_12;

import java.util.LinkedList;
import java.util.Queue;

public class DriveBST {
    public static void main(String[] args) {
        BST theTree = new BST();
        theTree.addNode( 50, "The Boss");
        theTree.addNode( 40, "VP Marketing");
        theTree.addNode( 45, "VP Marketing II");
        theTree.addNode( 60, "VP Development");
        theTree.addNode( 65, "Development Manager");
        theTree.addNode( 35, "Marketing Manager");
        theTree.addNode( 30, "SalesPerson");

        int key = 60;
        BSTNode n = theTree.findNode( key );
        if ( n != null ) {
            System.out.printf("\n Found node:%s", n.toString());
        } else {
            System.out.printf("\n Not found node:%s", key);
        }
        System.out.printf("\n Post ---- ");
        postOrderTraverse( theTree.getRoot());

        System.out.printf("\n ===== Pre ---- ");
        preOrderTraverse( theTree.getRoot());
    }
    public static void inOrderTraverse( BSTNode focusNode ){
        if ( focusNode != null ) {
            inOrderTraverse( focusNode.left);
            System.out.printf( "\n%s", focusNode.toString() );
            inOrderTraverse( focusNode.right);
        }
    }
    public static void preOrderTraverse( BSTNode focusNode ){
        if ( focusNode != null ) {
            System.out.printf( "\n%s", focusNode.toString() );
            preOrderTraverse( focusNode.left);
            preOrderTraverse( focusNode.right);
        }
    }
    public static void postOrderTraverse( BSTNode focusNode ){
        if ( focusNode != null ) {
            postOrderTraverse( focusNode.left);
            postOrderTraverse( focusNode.right);
            System.out.printf( "\n%s", focusNode.toString() );

        }
    }
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

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return sum;
    }
}
