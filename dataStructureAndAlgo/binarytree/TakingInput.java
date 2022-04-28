package binarytree;

import java.util.Scanner;

public class TakingInput extends BinaryTreeUse {

	public static BinaryTree<Integer> takeInput(){
		System.out.println("Enter root data");
		Scanner s= new Scanner(System.in);
		int rootData= s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTree<Integer> root = new BinaryTree<>(rootData);
		BinaryTree<Integer> leftRoot = takeInput();
		BinaryTree<Integer> rightRoot = takeInput();
		root.left = leftRoot;
		root.right= rightRoot;
		
		return root;
		
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree<Integer> root = takeInput();
		printTree(root);

	}

}
