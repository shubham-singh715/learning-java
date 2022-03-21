package checkingjava2;

import java.util.ArrayList;
public class UsingArrayList {
	//LinkedList and HashSet are also similar to ArrayList
	public static void main (String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(30);
		myList.add(650);
		myList.add(50);
		
		//for printing the array
		System.out.println(myList);
		
		//for printing elements of array
		for (Integer  x : myList) 
			System.out.println(x);
		
		// for finding size of array
		System.out.println("Size =" +myList.size());
		
		//for removing any element 
		myList.remove(2);
		System.out.println(myList);
		
		
	}

}
