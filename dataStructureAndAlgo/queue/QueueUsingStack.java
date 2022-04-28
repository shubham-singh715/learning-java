package queue;

import java.util.Stack;

public class QueueUsingStack<T> {

	Stack<T> s1;
	Stack<T> s2;
	
	public QueueUsingStack() {
		s1= new Stack<>();
		s2= new Stack<>();
		
	}
	
	public int size() {
		return 0;
	}
	
	public void enqueue(T elem) {
		s1.push(elem);
	}
	
	public T dequeue() {
		for(int i=0;i<s1.size();i++) {
			s2.push(s1.pop());
		}	
		T temp= s2.pop();
		for(int i=0;i<s2.size();i++) {
			s1.push(s2.pop());
		}
		return temp;
	}

}
