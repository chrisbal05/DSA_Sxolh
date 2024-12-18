package BSTree;

public class BSTree {
    private TreeNode root;

    public BSTree() {
        root = null;
    }

    public boolean isEmpty(){
        return (root==null);
    }

    public TreeNode getRoot(){
        return root;
    }

    public void insertElement(Object data){
        if (isEmpty()){
            root = new TreeNode(data);
        }
        else{
            insertNode(data,root);
        }
    }

    public void inOrderTraversal(){
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println( );
    }

    public void preOrderTraversal(){
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println( );
    }

    public void postOrderTraversal(){
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println( );
    }

    private void insertNode(Object data, TreeNode node){
        //if (data==node.getNodeData()){
        if (((Comparable)data).compareTo(((Comparable)node.getNodeData())) == 0){
            return;
        }
        //if (data<node.getNodeData()){
        if (((Comparable)data).compareTo(((Comparable)node.getNodeData())) == -1){
            if (node.getLeftNode() == null){
                node.setLeftNode(new TreeNode(data));
            }
            else{
                insertNode(data, node.getLeftNode());
            }
        }
        else{
            if (node.getRightNode() == null){
                node.setRightNode(new TreeNode(data));
            }
            else{
                insertNode(data, node.getRightNode());
            }
        }
    }

    private void inOrder(TreeNode node){
        if (node == null){
            return;
        }
        inOrder(node.getLeftNode());
        System.out.print(node.getNodeData() + ", ");
        inOrder(node.getRightNode());
    }

    private void preOrder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.print(node.getNodeData() + ", ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    private void postOrder(TreeNode node){
        if (node == null){
            return;
        }
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getNodeData() + ", ");
    }
    //1 (c)
    public int numberOfNodes(){
        if (isEmpty())
            return 0;
        return size(root);
    }

    private int size(TreeNode node) {
        if (node==null)
            return 0;
        return size(node.getLeftNode()) + size(node.getRightNode()) + 1;
    }
    //1 (b)
    public int numberOfNodes2(){
        if (isEmpty())
            return 0;
        int n=0;
        return size2(root, n);
    }
    private int size2(TreeNode node, int n){
        if (node == null){
            return n;
        }
        n=size2(node.getLeftNode(),n);
        n++;
        n=size2(node.getRightNode(),n);
        return n;
    }

    //2
    public int treeHeight(){
        return height(root);
    }

    public int height(TreeNode node){
        int left=0, right=0;
        if (node==null)
            return 0;
        left=height(node.getLeftNode());
        right=height(node.getRightNode());
        if (left>right){
            return left+1;
        }
        else{
            return right+1;
        }
    }

    //3
    public int treeHeight(Object data){
        TreeNode h=searchNode(data,root);
        if ( h!=null){
            return height(h);
        }
        else{
            return -1;
        }
    }

    private TreeNode searchNode1(Object data, TreeNode node){
        TreeNode found=null;
        if (((Comparable)data).compareTo(((Comparable)node.getNodeData())) == 0){
            return node;
        }
        if (node.getLeftNode()!=null){
            found=searchNode1(data,node.getLeftNode());
        }
        if (node.getRightNode()!=null){
            if (found==null){
                found=searchNode1(data,node.getRightNode());
            }
        }
        return found;
    }
    private TreeNode searchNode(Object data, TreeNode node){
        if (((Comparable)data).compareTo(((Comparable)node.getNodeData())) == 0){
            return node;
        }
        else if (((Comparable)data).compareTo(((Comparable)node.getNodeData())) == -1){
            if (node.getLeftNode()==null){
                return null;
            }
            else{
                return searchNode(data,node.getLeftNode());
            }
        }
        else{
            if (node.getRightNode()==null){
                return null;
            }
            else{
                return searchNode(data,node.getRightNode());
            }
        }

    }
}
