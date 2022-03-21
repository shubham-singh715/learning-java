package string;

import java.util.Scanner;

public class Count_Words {

	public static String takingInput() {
		Scanner s= new Scanner(System.in);
		System.out.print("Write string: ");
		String str= s.nextLine();
		
		return str;
		
		}
	public static int words(String str) {
		int space=0;
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
		       ++space;
			}
		}
		
		return space+1;
	}
	public static void main(String[] args) {
	
//		String str = "Hi my name is Shubham";
		
		String str= takingInput();
		System.out.println("Number of Words are : " +words(str));
	}

}
