package recursion;

public class R18_Removepi {

	public static void pi(String str,int si) {
		if(si==str.length()) {
			return;
		}
		if(str.charAt(si)=='p' && str.charAt(si+1)=='i') {
			System.out.print("3.14");
			si++;
		}
		else {
			System.out.print(str.charAt(si));
		}
		pi(str,si+1);
		
	}
	
	public static String replace(String str) {
		if(str.length()<=1) {
			return str;
		}
		String ans="";
		String smallAns= replace(str.substring(1));
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			ans="3.14"+smallAns.substring(1);
		}
		else {
			ans= str.charAt(0)+smallAns;
		}
		return ans;
	}
	
	public static void main(String[] args) {
     String str="pipix";
     System.out.println(replace(str));
	pi(str,0);
	}

}
