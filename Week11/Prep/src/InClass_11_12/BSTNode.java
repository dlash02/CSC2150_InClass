package InClass_11_12;

public class BSTNode {
    public int key;
    String name;
    public BSTNode left;
    BSTNode right;
    public BSTNode(int key, String name) {
        this.key = key;
        this.name = name;
    }
    @Override
    public String toString() {
        return "BSTNode{" +
                "key=" + key +
                ", name='" + name + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
