package linkedlist;

public class PrintListRecursively_6 {
	
	public static void printRecursively(Node<Integer> head) {
		
		if(head==null) {
			return;
		}
		System.out.println(head.data);
		printRecursively(head.next);
		
	}

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		Node<Integer> node3 = new Node<>(30);
		Node<Integer> node4 = new Node<>(40);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		printRecursively(node1);
		

	}

}
