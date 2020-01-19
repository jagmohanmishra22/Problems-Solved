package geeks.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrderTreeTraversal {

	static Node root=null;
	public static void main(String[] args) 
	{
		insert();
		reverseTraverse(root);
			
	}	
		

	private static void reverseTraverse(Node root)
	{
		Stack<Node> s=new Stack<>();
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			s.push(temp);
		
			if(temp.right!=null)q.add(temp.right);	
			if(temp.left!=null)q.add(temp.left);
		}
			while(!s.isEmpty())
			{
				Node tos=s.pop();
				System.out.println(tos.data);
				
		}
		
	}

	private static void insert()
	{
		root=new Node(1);
	    root.left=new Node(4);
	    root.left.right=new Node(10);
	    root.left.left=new Node(7);
	    root.right=new Node(12);
	    root.right.right=new Node(2);
	   // root.right.right.left=new Node(25);
	    	
	}
	
}
