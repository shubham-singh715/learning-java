package binarysearchtree;

import binarytree.BinaryTree;
import binarytree.TakingInput;

//Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).

public class B02_ElementBetweenK1K2 extends TakingInput {
	
	public static void printElement(BinaryTree<Integer> root, int k1, int k2) {
		if(root==null) {
			return;
		}
		
		if(root.data>=k1 && root.data<=k2) {
			System.out.println(root.data);
			printElement(root.left, k1, k2);
			printElement(root.right, k1, k2);
		}
		if(root.data>k2) {
			printElement(root.left, k1, k2);
		}else if(root.data<k1) {
			printElement(root.right, k1, k2);
		}
	}

	public static void main(String[] args) {

		BinaryTree<Integer> node = takeInputBetter(true, 0, false);
		printTree(node);
		printElement(node, 5, 9);

	}

}
