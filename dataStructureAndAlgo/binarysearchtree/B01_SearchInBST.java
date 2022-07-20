package binarysearchtree;

import binarytree.BinaryTree;
import binarytree.TakingInput;

public class B01_SearchInBST extends TakingInput {
    
	//Binary Search Tree is a tree with each node with data 'd' having all element in left side smaller than 'd' and right side larger of equal
	//to 'd'.
	
	public static boolean searchTree(BinaryTree<Integer>root, int k) {
		
		if(root==null) {
			return false;
		}

		
		if(root.data==k) {
			return true;
		}else if(root.data>k) {
			return searchTree(root.left, k);
		}else {
			return searchTree(root.right, k);
		}
		
	}
	public static void main(String[] args) {

		BinaryTree<Integer> node= takeInputBetter(true, 0, false);
		
		System.out.println(searchTree(node, 5));

	}

}
