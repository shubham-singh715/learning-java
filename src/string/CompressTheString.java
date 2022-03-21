package string;

public class CompressTheString {

	public static String duplicate(String str) {
		String temp= ""+str.charAt(0);
		int count = 1;
		for(int i=1;i<str.length();i++) {
			int n= temp.length();
			if(str.charAt(i)==temp.charAt(n-1)) {
				count+=1;
			}
			if(str.charAt(i)!=temp.charAt(n-1)) {
               if(count>1) {
				temp=temp+count;
				count=1;
			}
               temp=temp+str.charAt(i);
		}
		}
		//for last character
		if(count>1) {
			temp+=count;
		}
		return temp;
	}
	public static void main(String[] args) {
		
String str = "adddaaaaffcdddd";
String s= duplicate(str);
System.out.println(s);
	}

}
