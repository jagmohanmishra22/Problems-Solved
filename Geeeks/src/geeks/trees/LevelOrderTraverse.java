package geeks.trees;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


//Open Item: Need to do implement DFS Apps for tree
//BFS,DFS for Graph with visted array


public class LevelOrderTraverse {

static Node root;
	
	public static void main(String[] args) {
		
		LevelOrderTraverse lot=new LevelOrderTraverse();
		lot.insert();
		lot.levelOrder(root);

	}
		


	//q.poll()-->removes in FIFO order w/o exception
	//q.remove()-->removes in FIFo & throws Exception
	private void levelOrder(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			System.out.println(temp.data);
			
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);
		}
	}

	private void insert() {
		root=new Node(1);
    	root.left=new Node(4);
    	root.left.right=new Node(10);
    	root.left.left=new Node(7);
    	root.right=new Node(12);
    	root.right.right=new Node(2);
    	root.right.right.left=new Node(25);
    	
	}
}
