package linkedlist;

public class DeleteNode5 extends InsertNode4{

	
	public static Node<Integer> delete(Node<Integer> head , int pos){
		
		if(pos==0) {
			return head.next;
		}
		int count =0;
		Node<Integer> prev =head;
		while(count<pos-1) {
			count++;
			prev=prev.next;
		}
		prev.next=prev.next.next;
		
		return head;
	}
	public static void main(String[] args) {
		Node<Integer> head= takeInput();
		head= delete(head, 0);
		print(head);
	}

}
