package binarysearchtree;

import binarytree.BinaryTree;
import binarytree.TakingInput;

public class B04_CheckBST extends TakingInput {

	public static boolean isBST(BinaryTree<Integer> root) {
	     
		if(root==null) {
			return true;
		}
		
		int min = minimun(root.right);
		if(min<root.data) {
			return false;
		}
		
		int max= maximum(root.left);
		if(max>root.data) {
			return false;
		}
		
		boolean left=isBST(root.left);
		boolean right=isBST(root.right);
	
		return left && right;
	}
	
	private static int minimun(BinaryTree<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		
		int left=minimun(root.left);
		int right=minimun(root.right);
		
		return Math.min(root.data, Math.min(left, right));
	}
	
	private static int maximum(BinaryTree<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		
		int left=maximum(root.left);
		int right=maximum(root.right);
		
		return Math.max(root.data, Math.max(left, right));
	}

	public static void main(String[] args) {
		
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		System.out.println(isBST(root));

	}

}
