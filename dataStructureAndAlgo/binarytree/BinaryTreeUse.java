package binarytree;

public class BinaryTreeUse {

	
	public static void printTree(BinaryTree<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		//PreOrder Tree Traversal      root-left-right
		
		System.out.print(root.data+":");
			if(root.left != null) {
				System.out.print(" L" + root.left.data);
			}
			if(root.right != null) {
				System.out.print(" R" + root.right.data);
			}
			System.out.println();
			
			printTree(root.left);		
			printTree(root.right);
		
		// PostOrder Tree Traversal     left-right-root
		
/*		printTree(root.left);		
		printTree(root.right);
		
		System.out.print(root.data+":");
		if(root.left != null) {
			System.out.print(" L" + root.left.data);
		}
		if(root.right != null) {
			System.out.print(" R" + root.right.data);
		}
		System.out.println();
*/	
		
		// InOrder Tree Traversal     left-root-right 
		
/*		printTree(root.left);		

		System.out.print(root.data+":");
		if(root.left != null) {
			System.out.print(" L" + root.left.data);
		}
		if(root.right != null) {
			System.out.print(" R" + root.right.data);
		}
		System.out.println();
	
		printTree(root.right);
*/				
	}
	
	public static void main(String[] args) {
		
		
		BinaryTree<Integer> root = new BinaryTree<>(1);
		BinaryTree<Integer> leftNode = new BinaryTree<>(2);
		BinaryTree<Integer> rightNode = new BinaryTree<>(3);
		
		root.left=leftNode;
		root.right=rightNode;
		
//		BinaryTree<Integer> rightOf2 = new BinaryTree<>(4);
//		BinaryTree<Integer> leftOf3 = new BinaryTree<>(5);
//		
//		leftNode.right=rightOf2;
//		rightNode.left=leftOf3;
		
		printTree(root);
		
		

	}

}
