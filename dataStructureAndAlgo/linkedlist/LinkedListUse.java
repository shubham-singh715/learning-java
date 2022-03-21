package linkedlist;

public class LinkedListUse {
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
	      while( temp!=null) {
			System.out.println( temp.data);
			 temp= temp.next;
		}
	}

	public static Node<Integer> linkedList(){
		// n1 is reference to node containing data 10 and reference of n2 as next.
		//Similarly Node n2 is reference to data 20 and reference of n3 as next. This creates link between all nodes.
		Node<Integer> n1= new Node<>(10);
		Node<Integer> n2= new Node<>(20);
		Node<Integer> n3= new Node<>(30);
		Node<Integer> n4= new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
	
		return n1;
		
	}
	public static void main(String args[]) {
		
		Node<Integer> head =linkedList();
	     
		print(head);
	
		
		
		
	
		
	}
}
