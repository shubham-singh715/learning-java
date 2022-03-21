package linkedlist;

public class MergeSortedLL_8 extends InsertNode4{

	public static Node<Integer> merge(Node<Integer> t1,Node<Integer> t2){
		Node<Integer> head;
		Node<Integer> tail;
		
			if(t1.data<t2.data) {
				head=t1;
				tail=t1;
				t1=t1.next;
				
			}else {
				head=t2;
				tail=t2;
				t2=t2.next;
			}
			while(t1!=null && t2!=null) {
				if(t1.data<t2.data) {					
					tail.next=t1;
					tail=t1;
					t1=t1.next;
					
				}else {
					tail.next=t2;
					tail=t2;
					t2=t2.next;
				}	
		}
			if(t1 != null) {
				tail.next=t1;
			}
			if(t2 !=null) {
				tail.next=t2;
			}
		
		return head;
	}
	public static void main(String[] args) {
		Node<Integer> head= takeInput();
		Node<Integer> head2= takeInput();
		Node<Integer> hea=merge(head, head2);
		print(hea);

	}

}
