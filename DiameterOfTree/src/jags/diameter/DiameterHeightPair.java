package jags.diameter;

import java.util.HashMap;
import java.util.Map;

public class DiameterHeightPair{

		static Node root=null;
		public static void main(String... args) {
			
			insert();	
			System.out.println("diameter "+findHeightDiameter(root));
		}

		private static <T, V> Map<T,V> findHeightDiameter(Node root) {
			
			if(root==null)
			{
				
				return 0;
			}
			
			
			
			//Case1:When Diameter passes through root
			//Find Height of LST & RST and add both +1(for root node)
			
			
			//Case2:If Diameter lies in LST only
			int leftHeightDiameter=findDiameter(root.left);
			
			//Case3: If Diameter lies in RST only
			int rightDiameter=findDiameter(root.right);
			
			int finalDiameter=Math.max(diameterThroughRoot, Math.max(leftDiameter, rightDiameter));
			return finalDiameter;
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
	    	root.right.right.left.left=new Node(85);
		}


	}

