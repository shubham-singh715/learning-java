package string;

public class Check_Permutation {
/*	Two strings are said to be a permutation of each other when either 
	of the string's characters can be rearranged so that it becomes 
	identical to the other one. 
	Example: 
	str1= "sinrtg" 
	str2 = "string"*/
	
	 public static String removeAt(String str, int x) {
		 // To remove any character from String
		 return(str.substring(0, x)+ str.substring(x+1,str.length()));
	 }
	public static boolean checkPermutation(String str1,String str2) {
	int n= str2.length();
	if(str1.length()!=str2.length()) {
		return false;
	}
	for (int i=0;i<str1.length();i++) {
		for(int j=0; j<n;j++) {
			if(str1.charAt(i)==str2.charAt(j)) {
				
				str2= removeAt(str2, j);
				break;
			}
			if(str1.charAt(i)!=str2.charAt(j) && j==n-1 ) {
			return false;	
			}	
		}
		n=n-1;
	}
		return true;
	}

	public static void main(String[] args) {
		String str1= "aaajgfb";
		String str2 = "apbagfa";
		boolean x= checkPermutation(str1,str2);
		System.out.println(x);

	}

}
