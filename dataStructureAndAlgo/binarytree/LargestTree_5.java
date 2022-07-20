package binarytree;

public class LargestTree_5 extends TakingInput{

	public static int largestNode(BinaryTree<Integer> root) {
		if(root==null) {
			return -1;
		}
		int leftNode=largestNode(root.left);
		int rightNode=largestNode(root.right);
		
		return Math.max(root.data, Math.max(leftNode, rightNode));
	}
	public static void main(String[] args)  {
		
		BinaryTree<Integer> root =takeInputBetter(true, 0, false);
		System.out.println("Largest Node =" +largestNode(root));
		
	}

}
