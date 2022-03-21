package linkedlist;

import java.util.Scanner;

public class InsertNode4 {
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
	      while( temp!=null) {
			System.out.print( temp.data + " ");
			 temp= temp.next;
		}
	}
	
	public static Node<Integer> takeInput(){
		Scanner sc= new Scanner(System.in); 
		int data= sc.nextInt();
		Node<Integer> head=null, tail=null;
		
		while(data!=-1) {
			Node<Integer> currentNode= new Node<>(data);
			if(head==null) {
				head= currentNode;
				tail=currentNode;
			}else {
				tail.next= currentNode;
				tail=currentNode; //or tail=tail.next;
			}
			data=sc.nextInt();		
			}
		return head;
	}

	public static Node<Integer> insert(Node<Integer>head, int data, int pos) {
		Node<Integer> nodeToBeInserted = new Node<>(data);
		
		if(pos==0) {
			nodeToBeInserted.next=head;
			return nodeToBeInserted;
		}else {
		
		int count =0;
		Node<Integer> prev = head;
		while(count<pos-1 && prev != null) {
			count++;
			prev=prev.next;
		}
		if(prev!= null) {
		nodeToBeInserted.next= prev.next;
		prev.next=nodeToBeInserted;
		}
		return head;
		}
	}
	public static void main(String[] args) {
		Node<Integer> head= takeInput();
        head =insert(head, 80, 5);
        print(head);
	}

}
