package binarysearchtree;

import binarytree.BinaryTree;
import binarytree.TakingInput;

public class B03_SortedArrayToBST extends TakingInput {

	public static BinaryTree<Integer> convert(int arr[], int si, int ei){
		
		if(si>ei) {
			return null;
		}
		int mid= si+(ei-si)/2;

		BinaryTree<Integer> root = new BinaryTree<Integer>(arr[mid]);

		
		root.left= convert(arr,si,mid-1);
		root.right= convert(arr,mid+1,ei);
		
		
		
		return root;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};

		BinaryTree<Integer> root= convert(arr,0,arr.length-1);
		
		printTree(root);
	}

}
