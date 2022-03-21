package linkedlist;
import java.util.Scanner;
public class LinkedList_Input_3 {

	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
	 while(temp!=null) {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
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
	public static void main(String[] args) {
		
		Node<Integer> head= takeInput();
		
		print(head);

	}

}
