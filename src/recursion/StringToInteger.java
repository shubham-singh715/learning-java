package recursion;

public class StringToInteger {

	public static int toInt(String str) {
		if(str.length()==1) {
			return str.charAt(0)-'0';
		}
		int x=  toInt(str.substring(1));
	    int  a =(str.charAt(0)-48)*(int)Math.pow(10, str.length()-1);
	    return x+a;
		
	}
	public static void main(String[] args) {
		String str="162340";
      System.out.println(toInt(str));
	}

}
