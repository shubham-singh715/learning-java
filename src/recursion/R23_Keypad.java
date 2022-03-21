package recursion;

public class R23_Keypad {

	public static String[] group(int n) {
		if(n==2){
		String output[]={"a","b","c"};
		return output;
	}
		else if(n==3){
	String output[]={"d","e","f"};
	return output;
   }
		else if(n==4){
String output[]={"g","h","i"};
return output;
}
		else if(n==5){
String output[]={"j","k","l"};
return output;
}
		else if(n==6){
String output[]={"m","n","o"};
return output;
}
		else if(n==7){
String output[]={"p","q","r","s"};
return output;
}
		else if(n==8){
String output[]={"t","u","v"};
return output;
}
		else  {
String output[]={"w","x","y","z"};
return output;
}

}

	public static String[] keypad(int n) {
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		String [] smallAns= keypad(n/10);
		String c[]= group(n%10);
		String ans[]=new String[c.length*smallAns.length];
		int k=0;
		for(int j=0;j<c.length;j++) {
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=smallAns[i]+c[j];
			k++;
		}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int n=234;
      String c[]=keypad(n);
      for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);		}
	}

}
