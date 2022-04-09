package stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversalTask4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String str= sc.nextLine();
		
		System.out.println(minBracket(str));

	}

	private static int minBracket(String str) {
		
		Stack<Character> stack = new Stack<>();
		if(str.length()%2!=0) {
			return -1;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{') {
				stack.push('{');
			}else {
				 if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
				}else {
					stack.push('}');
				}
			}
		}
		int count=0;
		while(!stack.isEmpty()) {
			char c1=stack.pop();
			char c2= stack.pop();
			if(c1==c2) {
			count++;	
			}else {
				count+=2;
			}
		}
			return count;			
	}

}
