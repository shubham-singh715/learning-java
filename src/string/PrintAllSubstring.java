package string;

public class PrintAllSubstring {
     
	public static void allSubstring (String str) {
		int n= str.length();
		
		for (int i=0;i<n;i++) {
			String s= "";
			for (int j=i;j<n;j++) {
				
				s+=str.charAt(j);
					System.out.println(s);
					
					
			//  Or this method-> System.out.println(str.substring(i, j+1));
				
			}
		}
	}
	public static void main(String[] args) {
	String str= "abcd";
	allSubstring(str);
 
	}

}
