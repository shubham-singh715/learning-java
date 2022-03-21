package string;

public class RemoveConsecutiveDuplicate {

	public static String duplicate(String str) {
		String temp= ""+str.charAt(0);
	
		for(int i=1;i<str.length();i++) {
			int n= temp.length();
			if(str.charAt(i)==temp.charAt(n-1)) {
				
			}
			if(str.charAt(i)!=temp.charAt(n-1)) {
				temp=temp+str.charAt(i);
			}
               
			}
		return temp;
	}
	public static void main(String[] args) {
		
String str = "adddaaaaffcdddd";
String s= duplicate(str);
System.out.println(s);
	}

}
