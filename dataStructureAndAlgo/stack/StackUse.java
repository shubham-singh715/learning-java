package stack;

public class StackUse {

	public static void main(String[] args) throws StackEmptyException{
		
		StackUsingArray stack = new StackUsingArray();
		
		stack.push(10);
		stack.push(45);
		stack.push(67);
		stack.push(23);
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.top());

	}

}
