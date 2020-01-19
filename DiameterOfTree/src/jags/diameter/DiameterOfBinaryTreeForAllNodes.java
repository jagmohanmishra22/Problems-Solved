package jags.diameter;

/** @author JAGMOHAN
 *
 *HackerEarth:Print level-wise diameter for all nodes of tree going through node i(where i = root node) ,in it's sub tree
 *
 *Normal approach--O(n^2)
 */

//Open item:(1)normal approach--O(n^2)
//(1)Queue+bfs--- approach--O(n)


public class DiameterOfBinaryTreeForAllNodes{

	static Node root=null;
	public static void main(String[] args) {
		
		insert();
		int h=DiameterOfBinaryTreeForAllNodes.height(root);
		for(int level=1;level<=h;level++)
		{
			printLevelOrder(root,level);
		}
		
	}

	private static void printLevelOrder(Node root, int level)
	{
		if(root==null)return;
		else if(level==1)System.out.println(root.key+ "-"+findDiameter(root));
		else {
			printLevelOrder(root.left,level-1);
			printLevelOrder(root.right,level-1);	
		}
	}

	private static int findDiameter(Node root) {
		
		if(root==null) return 0;
		int lheight=height(root.left);
		int rheight=height(root.right);
		int diameter=lheight+rheight;
		return diameter;
	}

	private static int height(Node root) {
		if(root==null)return 0;
		int lh=1+height(root.left);//Height is max (LST,RST) in LST & RST from root node
		int rh=1+height(root.right); 
		return Math.max(lh, rh);
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
