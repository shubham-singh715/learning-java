package string;

import java.util.Scanner;

public class MinimumLengthWord {

	public static String length(String str) {
		String temp="";
		String min=str;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				temp+=str.charAt(i);
			}
			else {
				
				if(temp.length()<min.length()) {
				min=temp;
				temp="";
				}
				else {
					temp="";
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String str =s.nextLine();
       String a=length(str);
       System.out.println(a);
	}

}
