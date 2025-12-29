package Prep_BST_11_24;

import java.util.concurrent.atomic.AtomicBoolean;

public class BST {
    public static int counter = 0;
    public BSTNode root;

    public void addNode(int key, String name) {
        BSTNode newNode = new BSTNode(key, name);
        if (root == null) {
            root = newNode;
        } else {
            // Not an emptytree
            // start with root
            BSTNode focusNode = root;
            BSTNode parent;
            while (true) {
                parent = focusNode; // first time thr is root
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        // leftChild has no children
                        // set parent to newNode
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    // Need to put node on right
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public BSTNode findNode(int sKey) {
        // Idea: Search BST and
        //    return the node if it finds it
        //    return  null if it does not find it
        // So we add nodes and then search by key
        BSTNode focusNode = root;
        while (focusNode.key != sKey) {
            if (sKey < focusNode.key) {
                // Search the left child
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }
    public BSTNode findTheSmallest(BSTNode node) {
        if (node.leftChild == null) {
            return node;
        }
        return findTheSmallest(node.leftChild);
    }
    public boolean isBalanced( )  {
        // use `AtomicBoolean` to get the result since `Boolean` is passed by value
        // in Java

        AtomicBoolean isBalanced = new AtomicBoolean(true);
        isHeightBalanced( root, isBalanced);

        return isBalanced.get();
    }
    public static int isHeightBalanced(BSTNode root, AtomicBoolean isBalanced) {
        // base case: tree is empty or not balanced
        if (root == null || !isBalanced.get()) {
            return 0;
        }

        // get the height of the left subtree
        int left_height = isHeightBalanced(root.leftChild, isBalanced);

        // get the height of the right subtree
        int right_height = isHeightBalanced(root.rightChild, isBalanced);

        // tree is unbalanced if the absolute difference between the height of
        // its left and right subtree is more than 1
        if (Math.abs(left_height - right_height) > 1) {
            isBalanced.set(false);
        }

        // return height of subtree rooted at the current node
        return Math.max(left_height, right_height) + 1;
    }
    // Helper function to find minimum value node in a given BST
    public static BSTNode findMinimum(BSTNode root)
    {
        while (root.leftChild != null) {
            root = root.leftChild;
        }

        return root;
    }

    // Recursive function to find an inorder successor for the given key in the BST
    public static BSTNode findSuccessor(BSTNode root, BSTNode succ, int key)
    {
        // base case
        if (root == null) {
            return succ;
        }

        // if a node with the desired value is found, the successor is the minimum
        // value node in its right subtree (if any)
        if (root.key == key)
        {
            if (root.rightChild != null) {
                return findMinimum(root.rightChild);
            }
        }

        // if the given key is less than the root node, recur for the left subtree
        else if (key < root.key)
        {
            // update successor to the current node before recursing in the
            // left subtree
            succ = root;
            return findSuccessor(root.leftChild, succ, key);
        }

        // if the given key is more than the root node, recur for the right subtree
        else {
            return findSuccessor(root.rightChild, succ, key);
        }

        return succ;
    }

}
