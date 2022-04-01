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
		Node<E> t1= new Node<>(i);
	}
	
	public E top() {
		
	}
	
	public E pop() {
		
	}

}
