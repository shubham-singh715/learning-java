package string;

import java.util.Scanner;

public class RemoveCharacter {
	public static String removeCharacter(String str, char ch) {
		String temp = "";
		for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=ch) {
					temp=temp+str.charAt(i);
				}
			
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("EString");
		String str= sc.nextLine();
		System.out.println("Enter character to be removed");
		char ch= sc.next().charAt(0);
		
		System.out.println(removeCharacter(str,ch));

	}

}
