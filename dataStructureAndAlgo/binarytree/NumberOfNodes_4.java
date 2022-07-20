package binarytree;

public class NumberOfNodes_4 extends TakingInput{
	
	public static int sumOfnodes(BinaryTree<Integer> root) {
		if(root==null) {
			return 0;
		}
	
		int leftSum=sumOfnodes(root.left);
		int rightSum=sumOfnodes(root.right);
		
		return root.data+leftSum+rightSum;
	
	}
 
	public static int numberOfNodes(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftNode = numberOfNodes(root.left);
		int rightNode = numberOfNodes(root.right);
		return 1+leftNode+rightNode;
	}
	
	public static void main(String[] args) {
		
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printTree(root);
	 System.out.println("Number of nodes = " +numberOfNodes(root));	
	 System.out.println("Sum of nodes = " + sumOfnodes(root));

	}

}
