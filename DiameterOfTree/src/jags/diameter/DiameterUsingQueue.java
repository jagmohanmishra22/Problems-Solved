package jags.diameter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/** @author JAGMOHAN
 *
 *HackerEarth:Print level-wise diameter for all nodes of tree going through node i(where i = root node) 
 *
 *Usind Q:approach--O(n)
 */

//(1)Queue+bfs--- approach--O(n)


public class DiameterUsingQueue{

	static Node root=null;
	
	static Map<Integer,Integer> keyDiameter=new HashMap<>();
	public static void main(String[] args) {
		
		
		DiameterUsingQueue dt=new DiameterUsingQueue();
		dt.insert();
		
		printLevelOrder(root);
		//System.out.println(keyDiameter);

	}

	private static void printLevelOrder(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			
			Node temp=q.poll();	//Automatically removes element from first position:FIFO-->front in Queue
			System.out.println(temp.key+"-"+findDiameter(temp));
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);
	
		}
		
	}

	private static int findDiameter(Node root) {
		
		if(root==null);
		int lheight=height(root.left);
		int rheight=height(root.right);
		int diameter=lheight+rheight;
		return diameter;
	}

	private static int height(Node root) {
		if(root==null)return 0;
		int lh=1+height(root.left);
		int rh=1+height(root.right); 
		return Math.max(lh, rh);
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
