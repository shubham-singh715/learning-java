package binarytree;

public class RemoveLeaf_10 extends TakingInput {

	public static BinaryTree<Integer> removeLeaf(BinaryTree<Integer> root){
		if(root==null) {
			return null;
		}
		
		if(root.left==null && root.right==null) {
			return null;
		}
		
		root.left=removeLeaf(root.left);
		root.right=removeLeaf(root.right);
		
		return root;
	}
	public static void main(String[] args) {
	
		BinaryTree<Integer> node = takeInputBetter(true, 0, false);
		removeLeaf(node);
		printTree(node);

	}

}
