package stack;

import java.util.Stack;

public class StackInCollections {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);                         //push
		stack.push(20);
		System.out.println(stack.size());       //size
        System.out.println(stack.peek());       //top
        System.out.println(stack.pop());        //pop
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
	}

}
