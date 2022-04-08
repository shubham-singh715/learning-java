package stack;

import java.util.Scanner;
import java.util.Stack;

public class BracketsBalancedTask1 {
	  /* For a given a string expression containing only round brackets or parentheses, check if they are balanced or not.
			  Sample Input 1 :
				(()()())
				Sample Output 1 :
				true
				Sample Input 2 :
				()()(()
				Sample Output 2 :
				false */

	public static boolean brackets(String s) {
		Stack<String> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push("(");
			}
			if(s.charAt(i)==')') {
				if(!stack.isEmpty()) {
				stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(brackets(s));
		
	}

}
