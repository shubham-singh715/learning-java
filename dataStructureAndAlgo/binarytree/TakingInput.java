package binarytree;

import java.util.Scanner;

public class TakingInput extends BinaryTreeUse {
	
	public static BinaryTree<Integer> takeInputBetter(boolean isRoot, int parentData , boolean isLeft){
		if(isRoot) {
		System.out.println("Enter root data");
	}else {
		if(isLeft){
			System.out.println("Enter left of " +parentData);
		}else {
			System.out.println("Enter right of " + parentData);
		}
	}
		
		Scanner s= new Scanner(System.in);
		int rootData= s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTree<Integer> root = new BinaryTree<>(rootData);
		BinaryTree<Integer> leftRoot = takeInputBetter(false,rootData,true);
		BinaryTree<Integer> rightRoot = takeInputBetter(false,rootData,false);
		root.left = leftRoot;
		root.right= rightRoot;
		
		return root;
		
	}

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
		
		BinaryTree<Integer> root = takeInputBetter(true,0,true);
		printTree(root);

	}

}
