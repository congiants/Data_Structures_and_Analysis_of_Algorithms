package binaryTreeObject;

public class TreeNode {
    private TreeNode left, right;
    private Object data;

    public TreeNode() {
        left = right = null;
    }
    
    public TreeNode(Object data){
        this.data = data;
    }
 
    public boolean isLeaf( ){
        return left == null && right == null;
    }
 
    
    public void setData(Object data) {
        this.data = data;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Object getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
    
    
       
}