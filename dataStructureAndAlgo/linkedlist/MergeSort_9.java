package linkedlist;

public class MergeSort_9 extends InsertNode4{
	
	public static Node<Integer> mergeSort(Node <Integer> head) {
		if(head.next==null) {
			return head;
		}
		Node <Integer> fast=head , slow=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}

		Node <Integer> firsthead=head;
		Node <Integer> secondhead=slow.next;
		slow.next=null;
		 firsthead=mergeSort(firsthead);
		secondhead=mergeSort(secondhead);
	
		Node <Integer> mergedHead=mergeSortedList(firsthead,secondhead);
		return mergedHead;
	}

	public static Node<Integer> mergeSortedList(Node<Integer> firstSortedHead, Node<Integer> secondSortedHead) {
		Node <Integer> t1=firstSortedHead,t2=secondSortedHead;
		Node <Integer> head , tail;
		if(t1.data<=t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}else {
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		while(t1 != null && t2 != null) {
			if(t1.data<=t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		if(t1!=null) {
		 tail.next=t1;
		}
		if(t2 !=null) {
	    	tail.next=t2;
		}

		return head;
	}

	public static void main(String[] args) {
		Node <Integer> head = takeInput();
		Node <Integer> mergedHead= mergeSort(head);
		print(mergedHead);

	}

	

}
