package binaryTreeObject;

public class BSTreeManagement
{
    
    public static void main(String args[ ])
    {
        Object matrix[ ] = {40, 15, 25, 18, 50, 20, 10, 70, 55, 45, 5 };

        BSTree tree = new BSTree( );
        for (int i=0; i<matrix.length; i++) 
            tree.insertElement(matrix[i]); 
        
        tree.inOrderTraversal( );
        tree.preOrderTraversal( ); 
        tree.postOrderTraversal( );
        
        System.out.println(tree.size());     
        System.out.println(tree.isEmpty());
        System.out.println(tree.search(12));
        System.out.println(tree.search(40));
        System.out.println(tree.treeHeigth());
        System.out.println(tree.treeHeigth(15));
        
        Object ar[] = new Object[200];
        ar = tree.inOrderSort();
        for (int i=0; i<matrix.length; i++) 
        System.out.println(ar[i]);
    }
}

