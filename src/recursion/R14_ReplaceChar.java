package recursion;

public class R14_ReplaceChar {

	public static String replace(String str, char n,char m) {
		if(str.length()==0) {
			return str;
		}
		String ans="";
		if(str.charAt(0)!=n) {
			ans=ans+str.charAt(0);
		}
		else {
			ans=ans+m;
		}
		String smallAns= replace(str.substring(1),n,m);
		return ans+smallAns;
	}
	public static void main(String[] args) {
		char n='a';
		char m='x';
		String str="abacd";
 System.out.println(replace(str,n,m));
	}

}
