package binarytree;

public class GreaterThanX_6 extends TakingInput {
	
	public static int greater(BinaryTree<Integer> root , int x) {
		
		if(root==null) {
			return 0;
		}
		
		int leftNode = greater(root.left, x);
		int rightNode = greater(root.right, x);
		
		if(root.data > x) {
			return 1+leftNode+rightNode;
		}else {
			return leftNode+rightNode;	
		}
		
	}
	public static void main(String args[]) {
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printTree(root);
		System.out.println("Greater ="+greater(root, 5));
	}
	

}
