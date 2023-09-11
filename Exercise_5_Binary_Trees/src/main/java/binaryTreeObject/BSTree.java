package binaryTreeObject;

public class BSTree {
    private TreeNode root;

    public BSTree() {
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void insertElement(Object data){ 
	if (isEmpty())
            root = new TreeNode(data);   
	else  insertNode(data,root); 
    }
    
    private void insertNode(Object data, TreeNode node) {
        Comparable coData = (Comparable)data;
        Comparable coNode = (Comparable)node.getData();
        if(coData.compareTo(coNode)<0){
            if (node.getLeft() == null) node.setLeft(new TreeNode(data));
            else insertNode(data, node.getLeft());
        }
        
        else{
            if (node.getRight() == null) node.setRight(new TreeNode(data));
            else insertNode(data, node.getRight());
        }
    }
    
    public void inOrderTraversal( ) { 
	System.out.println("INORDER TRAVERSAL");   
	inOrder(root);   
	System.out.println( ); 
    }   

    public void preOrderTraversal( ) { 
	System.out.println("PREORDER TRAVERSAL");  
	preOrder(root);   
	System.out.println( ); 
    }   

    public void postOrderTraversal( ) { 
	System.out.println("POSTORDER TRAVERSAL");   
	postOrder(root);   
	System.out.println();
    }
    
    private void inOrder(TreeNode node){
        if (node == null) return;
        inOrder(node.getLeft());
        System.out.println(node.getData() + " ");
        inOrder(node.getRight());
    }
            
    private void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.println(node.getData() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());       
    } 
            
    private void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getData() + " ");
    }
    
    public int size(){
        return size(root);
    }
    
    private int size(TreeNode node){
        if (node == null) return 0;
        return 1 + size(node.getLeft()) + size(node.getRight());
    }
    
    public boolean search(int data){
        return search(data, root);
    }
    
    private boolean search (Object data, TreeNode node){
        if (node == null) return false;
        if (node.getData() == data) return true;
        if (search(data, node.getLeft())) return true;
        return (search(data, node.getRight()));
    }
    
    public int treeHeigth( ){
        return treeHeigth(root);
    }
    
    private int treeHeigth(TreeNode node){
        if (node ==null) return 0;
        return 1 + Math.max(treeHeigth(node.getLeft()), treeHeigth(node.getRight()));
    }
    
    public int treeHeigth(int data){
        return treeHeight(data, root);
    }
    
    private int treeHeight(Object data, TreeNode node){
        if (node == null) return 0;
        Comparable coData = (Comparable)data;
        Comparable coNode = (Comparable)node.getData();
        if (coData.compareTo(coNode)<0) return treeHeight(data, node.getLeft()) + 1;
        return treeHeight(data, node.getRight())+1;
    }

    public Object [] inOrderSort(){
        Object array[] = new Object [size()];
        inOrderSort(root, array, 0);
        return array;
    }
    private int inOrderSort(TreeNode node, Object array[], int i){
        if (node == null) return i;
        i = inOrderSort(node.getLeft(), array, i);
        array[i] = node.getData();
        i++;
        i = inOrderSort(node.getRight(), array, i);
        return i;
    }
    
    public int leafNodes(){
        return leafNodes(root);
    }
    
    private int leafNodes(TreeNode node){
        if (node.isLeaf()) return 1;
        return leafNodes(node.getRight())+ leafNodes(node.getLeft());
    }
    
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
