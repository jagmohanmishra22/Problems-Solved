package geeks.trees;

import java.util.Stack;

public class ZigZagTraversal {

	static Node root=null;
	public static void main(String[] args) {
		insert();
		zigZagTraverse(root);
		
		
	}

	private static void zigZagTraverse(Node root)
	{
		Stack<Node> s1=new Stack<>();
		Stack<Node> s2=new Stack<>();
		
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) 
		{
			
			while(!s1.isEmpty()) 
			{
				Node temp=s1.pop();
				System.out.println(temp.data);
				if(temp.left!=null)s2.push(temp.left);
				if(temp.right!=null)s2.push(temp.right);
			}
			while(!s2.isEmpty())
			{
				Node temp=s2.pop();
				System.out.println(temp.data);
				if(temp.right!=null)s1.push(temp.right);
				if(temp.left!=null)s1.push(temp.left);
			}
			
		}
		
		

	}

	private static void insert() {
		root=new Node(1);
    	root.left=new Node(4);
    	root.left.right=new Node(10);
    	root.left.left=new Node(7);
    	root.right=new Node(12);
    	root.right.right=new Node(2);
    	root.right.right.left=new Node(25);
    	
	}
}
