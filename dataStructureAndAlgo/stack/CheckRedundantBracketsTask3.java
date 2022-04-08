package stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBracketsTask3 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String str = sc.nextLine();
	
	System.out.println(checkReduntant(str));
	
	}

	private static boolean checkReduntant(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=')') {
				stack.push(str.charAt(i));
			}else {
				int count=0;
				while(stack.pop()!='(') {
					stack.pop();
					count++;
				}
				if(count==0)
			}
		}
		return true;
	}

}
