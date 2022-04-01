package stack;

import linkedlist.Node;

public class StackUsingLinkedList<E> {
	
	private Node<E> head;
	private int size;
	
	public StackUsingLinkedList(){
		head = null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(E i) {
		
		Node<E> newNode= new Node<>(i);
		newNode.next=head;
		head=newNode;
		size++;
	
	}
	public E top() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		return head.data;
		
	}
	
	public E pop() throws StackEmptyException{

			if(head==null) {
				throw new StackEmptyException();
			}
		E temp=head.data ;
		head=head.next;
		
		size--;
		return temp;
		
	}

}
