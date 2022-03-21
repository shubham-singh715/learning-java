package string;

public class ReverseString_WordWise {
	
	public static String reverseWords(String str) {
		String st= "";
		String temp ="";
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				st= st+str.charAt(i);
			}
			if(str.charAt(i)==' ' || i==str.length()-1) {
				temp =st+ " " + temp ;
				st="";
			}
		}
		return temp;
	}

	public static void main(String args[]) {
		String str= "My name is Shubham";
		String s = reverseWords(str);
		System.out.println(s);
	}
}
