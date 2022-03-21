package string;

public class Reverse_Each_Word {
	
	public static String reverseWords(String str) {
		String st= "";
		String temp ="";
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				st= str.charAt(i) +st;
			}
			if(str.charAt(i)==' ' || i==str.length()-1) {
				temp =temp +st+ " ";
				st="";
			}
		}
		return temp;
	}

	public static void main(String args[]) {
		String str= "hi my name is Shubham";
		String s = reverseWords(str);
		System.out.println(s);
	}
}
