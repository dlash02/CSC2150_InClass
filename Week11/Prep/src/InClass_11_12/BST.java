package InClass_11_12;

public class BST {
    private BSTNode root;
    public BST() {
        this.root = null;
    }
    public void addNode( int key, String name ){
        BSTNode newNode = new BSTNode(key,name);
        if ( this.root == null) {
            this.root = newNode;
        } else {
            // Find the right place to 'hang' it
            BSTNode focusNode = this.root;
            BSTNode parent;
            while( true ){
                parent = focusNode;
                if ( key < focusNode.key ) {
                    focusNode = focusNode.left;
                    if ( focusNode == null ) {
                        // Thats the spot
                        parent.left = newNode;
                        break;
                    }
                    // Then will goto the left
                } else {
                    // will move to right
                    focusNode = focusNode.right;
                    if ( focusNode == null ) {
                        // Thats the spot
                        parent.right = newNode;
                        break;
                    }
                }
            }
        }
    }
    public BSTNode findNode( int key ) {
        BSTNode focusNode = this.root;
        // return the node if found
        // return null if not found
        while ( focusNode.key != key ) {
            if ( key < focusNode.key ) {
                focusNode = focusNode.left;
            } else {
                focusNode = focusNode.right;
            }
            if ( focusNode == null ) {
                return null;
            }
        }
        return focusNode;
    }
    public BSTNode getRoot() {
        return this.root;
    }

}
