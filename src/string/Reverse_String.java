package string;

public class Reverse_String {
	
	public static void reverseString(String str) {
		for (int i= str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}
		
	
		
	}

	public static void main(String[] args) {
	
		String str ="hi gangadhar radar";
         reverseString(str);
		
	}

}
