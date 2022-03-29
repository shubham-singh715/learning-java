package stack;

import java.util.ArrayList;

public class StackUsingArray {

	private ArrayList<Integer> data;
	private int topIndex;
	
	public StackUsingArray( ) {
//		data= new int[10];
		data=new ArrayList<>(2);
		topIndex=-1;
	}
	
	public void push(int i)  {
//		if(topIndex==data.size()-1) {
//			throw new StackFullException();
//		}
		topIndex++;
		data.add(topIndex, i);
	}

	public int pop() throws StackEmptyException {
		if(topIndex==-1) {
			throw new StackEmptyException();
		}
		return data.get(topIndex--);
		
	}

	public int size() {
		return topIndex+1;
		
	}

	public boolean isEmpty() {
		if(topIndex==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int top() throws StackEmptyException {
		if(topIndex== -1) {
			throw new StackEmptyException();
		} 
		return data.get(topIndex);
	
	}
	

}
