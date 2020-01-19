package geeks.trees;


//(1)Inorder,PreOrder,PostOrder
//(2)Find a tree BST or Not?
//(3)BFS--LevelOrder traversal
//(4)Zig Zag traversal
//(5)Height Of Tree



public class TreeTraversal {

	Node root;
	public TreeTraversal()
	{
		
	}
	
	void inOrder()
	{
		inorder(root);
	}
	
	
	public void inorder(Node root)
	{
		if (root != null) {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
            
        }
		
	}
	
	public void preOrder(Node root)
	{
		if (root != null) {
			System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
            
        }
		
	}

}
