package binarytree;

public class MirrorBinarTree_11 extends TakingInput {

	// For a given Binary Tree of type integer, update it with its corresponding mirror image.
	
	public static BinaryTree<Integer> mirrorTree(BinaryTree<Integer> root ){
		if(root==null) {
			return null;
		}
		
		root.left= mirrorTree(root.left);
		root.right= mirrorTree(root.right);
		
		BinaryTree<Integer> temp =root.left;
			root.left=root.right;
			root.right=temp;
		
		return root;
	}
	
	public static void main(String[] args) {
	
	BinaryTree<Integer>	root = takeInputBetter(true, 0, false);
	printTree(root);
	printTree(mirrorTree(root));

	}

}
