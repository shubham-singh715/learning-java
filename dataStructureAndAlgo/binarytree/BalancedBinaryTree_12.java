package binarytree;

public class BalancedBinaryTree_12 extends TakingInput{

	
	public static boolean isBalanced(BinaryTree<Integer> root) {
		if(root==null) {
			return true;
		}
		
		int leftHeight= height(root.left);
		int rightHeight= height(root.right);
		
		if(Math.abs(leftHeight-rightHeight) > 1) {
			return false;
		}
		
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced= isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
	
	}
	private static int height(BinaryTree<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int leftHeight= height(root.left);
		int rightHeight= height(root.right);
		
		return 1+ Math.max(leftHeight, rightHeight);
	}
	public static void main(String[] args) {
		
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		
		System.out.println(isBalanced(root));

	}

}
