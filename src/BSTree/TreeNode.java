package BSTree;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private Object item;

    public TreeNode() {
    }

    public TreeNode(Object item) {
        left = right = null;
        this.item = item;
    }

    public TreeNode getLeftNode() {
        return left;
    }

    public void setLeftNode(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRightNode() {
        return right;
    }

public void setRightNode(TreeNode right) {
        this.right = right;
    }

    public Object getNodeData() {
        return item;
    }

    public void setNodeData(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", item=" + item +
                '}';
    }
}
