package binarytree;

public class NumberOfLeafNode_7 extends TakingInput{
	
	public static int leafNodes(BinaryTree<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right ==null) {
			return 1;
		}
		
		return leafNodes(root.left)+leafNodes(root.right);
	}

	public static void main(String[] args) {
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printTree(root);
		System.out.println("LeafNodes ="+leafNodes(root));

	}

}
