package binaryTreeInt;

public class BSTreeManagement
{
    
    public static void main(String args[ ])
    {
        int matrix[ ] = {40, 15, 25, 18, 50, 20, 10, 70, 55, 45, 5 };
        int matrix2[] = {10, 7, 13, 6, 8, 14, 11};
        
        BSTree tree = new BSTree( );
        for (int i=0; i<matrix.length; i++) 
            tree.insertElement(matrix[i]); 
        
        tree.inOrderTraversal( );
        tree.preOrderTraversal( ); 
        tree.postOrderTraversal( );
        
        System.out.println(tree.size());
        
        BSTree tree2 = new BSTree( );
        for (int i=0; i<matrix2.length; i++) 
            tree2.insertElement(matrix2[i]);
        
        System.out.println(tree2.leafNodes());
    }
}

