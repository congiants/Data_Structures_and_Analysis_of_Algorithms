package binaryTreeInt;

public class TreeNode {
    private TreeNode left, right;
    private int data;

    public TreeNode() {
        left = right = null;
    }
    
    public TreeNode(int data){
        this.data = data;
    }
 
    public boolean isLeaf( ){
        return left == null && right == null;
    }
 
    
    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
    
    
       
}