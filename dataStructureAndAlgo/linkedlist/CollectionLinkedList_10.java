package linkedlist;

import java.util.LinkedList;

public class CollectionLinkedList_10 {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList<>();
		
		//Taking Input
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		
		//Inserting
		list.add(1,40);
		
		//Replacing
		list.set(0,90);
		
		//Deleteing
		list.remove(4);
		
		
		System.out.println(list);

	}

}
