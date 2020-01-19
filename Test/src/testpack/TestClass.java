package testpack;
import java.util.*;

/**
 * Program:Find distance between any two nodes in a Binary tree
 * Two Approaches:
 * (I)distance(n1,n2)=dist(root,n1)+dist(root,n2)-2(root,lca)
 * 
 * (II)Better approach which is implemented here:
 * 1.lca=findLCA(root,n1,n2);
 * 2.int d1=findLevel(lca,n1,root_level);
 * 3.int d2=findLevel(lca,n2,root_level);
 * 4.return d1+d2;
 * 
 * LCA:Least Common Ancestor and Level of any given node are required in this algo
 */
class TestClass {

	static Node root=null;
	
    public static void main(String args[] )  
    {
    	int key = 0, level = 0;
    	Node lca;
    	int k1=0,k2=12;
    	TestClass  tc=new TestClass();
    	tc.insert();
    	tc.printInOrderTree(root);
    	level=findLevel(root,key,level);
    	System.out.println("Level "+level);
    	lca=findLCA(root,k1,k2);
    	System.out.println("LCA "+lca.key);
    	int distance=findDistancebetweenNodes(k1,k2);
    	System.out.println("Distance "+distance);
       
    }


	private static int findDistancebetweenNodes(int k1, int k2) {
		
		Node lca=findLCA(root, k1, k2);
		int d1=findLevel(lca, k1, 0);
		int d2=findLevel(lca, k2, 0);
		return d1+d2;
	}

	/**
	 * Visit LST and RST:if both collectively return nodes n1,n2 then their root is LCA
	 */
	

	private static Node findLCA(Node root, int k1, int k2) {
		
		if(root==null)return null;
		else if(root.key==k1 ||  root.key==k2) return root;
		else
		{
			Node left=findLCA(root.left,k1,k2);
			Node right=findLCA(root.right,k1,k2);
			if(left==null && right ==null)return null;
			else if(left==null && right !=null)return right;
			else if(left!=null && right ==null)return left;
			else return root;
		}
	}

/**
 * Find the Node in the tree for which level is asked.If found in LST return else visit RST
 */
	private static  int findLevel(Node root, int key, int level) {
		if(root==null)return 0;
		else if(root.key==key)return level;
		else 
		{
			int lev=findLevel(root.left,key,level+1);
			if(lev==0)return findLevel(root.right,key,level+1);
			else return lev;
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


	private void printInOrderTree(Node root)
	{
		if(root!=null)
		{
			printInOrderTree(root.left);
			System.out.println(root.key);
			printInOrderTree(root.right);
		}
	}

}
