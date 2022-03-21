package linkedlist;

public class Print_ith_Element {

	public static void print(Node<Integer> head,int j) {
		Node<Integer> temp=head;
		int i=0;
	      while( temp!=null) {
			if(j==i) {
				System.out.println(temp.data);
				return;
			}
			 temp= temp.next;
			 i++;
		}
	}

	public static Node<Integer> linkedList(){
		Node<Integer> n1= new Node<>(10);
		Node<Integer> n2= new Node<>(20);
		Node<Integer> n3= new Node<>(30);
		Node<Integer> n4= new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
	
		return n1;
		
	}
	public static void main(String[] args) {
	
		Node<Integer> head = linkedList();
		print(head, 2);

	}

}
