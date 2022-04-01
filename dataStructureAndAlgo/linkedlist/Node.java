package linkedlist;

public class Node<E> {
 
	//A Node of linked list will have 2 things i.e data and reference to next node.
	// So 2 variables are created data and next. We are giving generics to Node i.e Node<E>.
	// Generics is given becase while creating a new object of node we need to specify its data type.<Integer> or <String> etc
	public E data;
	public Node<E> next;
	
	public Node(E data){
		this.data=data;
		
	}

	
}
