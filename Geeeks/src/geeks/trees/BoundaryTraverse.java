package geeks.trees;


   
class BoundaryTraverse  
{ 
    static Node root; 

    void printLeaves(Node node)  
    { 
        if (node != null)  
        { 
            if (node.left == null && node.right == null) System.out.print(node.data + " ");
            printLeaves(node.left);
            printLeaves(node.right); 
        } 
    } 
    
    // Print the nodes in TOP DOWN manner 
    void printBoundaryLeft(Node node)  
    { 
        if (node != null)  
        { 
            if (node.left != null || node.right!=null)  
            { 
                   
                // to ensure top down order, print the node 
                // before calling itself for left subtree 
                System.out.print(node.data + " "); 
                printBoundaryLeft(node.left);
            }
   
        } 
    } 
   
    // A function to print all right boundry nodes, except a leaf node 
    // Print the nodes in BOTTOM UP manner 
    void printBoundaryRight(Node node)  
    { 
        if (node != null)  
        { 
            if (node.right != null || node.left != null)  
            { 
            	printBoundaryRight(node.right);
            	System.out.print(node.data + " "); 
                
            }
        } 
    } 
   
    void printBoundary(Node node)  
    { 
        if (node != null)  
        { 
            System.out.print(node.data + " "); 
   
            // Print the left boundary in top-down manner. 
            printBoundaryLeft(node.left); 
   
            // Print all leaf nodes 
            printLeaves(node.left); 
            printLeaves(node.right); 
   
            // Print the right boundary in bottom-up manner 
            printBoundaryRight(node.right); 
        } 
    } 
    
    public static void main(String args[])  
    { 
        BoundaryTraverse tree = new BoundaryTraverse(); 
        root=new Node(1);
    	root.left=new Node(4);
    	root.left.right=new Node(10);
    	root.left.left=new Node(7);
    	root.right=new Node(12);
    	root.right.right=new Node(2);
    	root.right.right.left=new Node(25);
        tree.printBoundary(tree.root); 
   
    } 
} 