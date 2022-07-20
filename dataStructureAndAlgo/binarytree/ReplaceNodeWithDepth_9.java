package binarytree;

public class ReplaceNodeWithDepth_9 extends TakingInput{

	public static void main(String[] args) {
		BinaryTree<Integer> node = takeInputBetter(true,0,false);
		printTree(node);
		 replaceNode(node,0);
		printTree(node);

	}

	private static void replaceNode(BinaryTree<Integer> node, int i) {
		
		if(node== null) {
		return ;
	}
		node.data=i;
		
		 replaceNode(node.left, i+1);
		 replaceNode(node.right, i+1);
		
		
		
	}

}
