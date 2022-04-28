package queue;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {

	public static void main(String[] args) {
		
		//Queue is an interface. So new Object can be instantiated from some other class.
		
		Queue<Integer> queue =new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		System.out.println(queue.size());
		
		System.out.println(queue.peek());  //gets the top element in FIFO 
		System.out.println(queue.poll());  // deletes or removes top element in FIFO
	}

}
