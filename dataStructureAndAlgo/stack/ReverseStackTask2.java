package stack;

import java.util.Stack;

public class ReverseStackTask2 {
	
	//Reverse a Stack with help of 1 helper stack

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		int arr[] = {1,2,3,4,5};
		for(int elem : arr ) {
			stack.push(elem);
		}
		
		Stack<Integer> helper = new Stack<>();
		
		System.out.println(reverseStack(stack,helper));

	}

	private static Stack<Integer> reverseStack(Stack<Integer> stack,Stack<Integer> helper) {
		if(stack.isEmpty()) {
			return stack;
		}
		
		int temp=stack.pop();
		
		Stack<Integer> reverse =reverseStack(stack, helper);
		
		while(!stack.isEmpty()) {
			helper.push(stack.pop());
		}
		
		stack.push(temp);
		
		while(!helper.isEmpty()) {
			stack.push(helper.pop());
		}
		return stack;
	}

}
