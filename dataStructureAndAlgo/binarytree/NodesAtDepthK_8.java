package binarytree;

public class NodesAtDepthK_8 extends TakingInput {

	public static void depth(BinaryTree<Integer> tree, int k) {
		
		if(tree == null) {
			return ;
		}
		
		if(k==0) {
			System.out.println(tree.data);
			return;
		}
		
	     depth(tree.left,k-1);
	     depth(tree.right,k-1);
		
	}
	public static void main(String[] args) {

		BinaryTree<Integer> tree = takeInputBetter(true,0,false);
		depth(tree, 1);
		

	}

}
