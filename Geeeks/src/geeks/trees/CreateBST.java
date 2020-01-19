package geeks.trees;


public class CreateBST {
	Node root;
	static Node head;
	
	public CreateBST(){
		 root=null;
	}
	
public static void main(String[] args)
{
	
	CreateBST bst=new CreateBST();
	bst.insertNode(7);
	bst.insertNode(2);
	bst.insertNode(10);
	bst.insertNode(6);
	bst.insertNode(1);
	bst.insertNode(15);
	
	
	
	TreeTraversal t=new TreeTraversal();
	t.inorder(head);
	System.out.println();
	System.out.println("end of traversal");
	t.preOrder(head);
}


private void insertNode(int val) {
	
	root=insert(val, root);
	head =root;
}

private  Node insert(int val,Node root) 
{
	//head=
	if(root==null )						//Create a node if root is null 
	{										
		root=new Node(val);
		return root ;
	}
	else if(val<root.data)
		
		root.left=insert(val,root.left);	
	else
	
		root.right=insert(val,root.right);
	
	return root;
}
	

}




