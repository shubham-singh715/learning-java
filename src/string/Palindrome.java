package string;

public class Palindrome {

     public static boolean palindrome(String str) {
    	 int n= str.length();
    	 for (int i=0; i<(str.length())/2;i++) {
    		 if(str.charAt(i)==str.charAt(n-1)) 
    		 {
    			 n--;    			
    		 }
    		 else  { 
    			return false;
    		 }
  		    		 
    	 }
    	 
	 	return true;
    	    	 
     }
	public static void main(String[] args) {
		
		
String str= "radar";
System.out.println(palindrome(str));


	}

}
