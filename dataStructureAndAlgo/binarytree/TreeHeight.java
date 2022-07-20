package binarytree;

public class TreeHeight extends TakingInput{

	public static int height(BinaryTree<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1+Math.max(leftHeight, rightHeight);
	}
	
	//Is node present? For a given Binary Tree of type integer and a number X, find whether a node exists in the tree with data X or not.
	public static boolean isNodePresent(BinaryTree<Integer> root , int x) {
		if(root==null) {
			return false;
		}
		
		if(root.data==x) {
			return true;
		}
	
		return isNodePresent(root.left, x) || isNodePresent(root.right, x);
	}

	
	
	public static void main(String[] args) {
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printTree(root);
		//System.out.println("Height of Tree ="+height(root));
		
		System.out.println("Is node present " + isNodePresent(root, 4));
	}

}
