package linkedlist;

public class ReverseLL_7 extends InsertNode4{
	
	public static Node<Integer> reverse(Node<Integer> head){
		
		if(head==null || head.next==null) {
			return head;
		}else {
		Node<Integer> reversedHead= reverse(head.next);
			head.next.next=head;
			head.next=null;
			
		return reversedHead;
	   }
	}

	public static void main(String[] args) {
	
		Node<Integer> head = takeInput();
		head = reverse(head);
		print(head);

	}

}
