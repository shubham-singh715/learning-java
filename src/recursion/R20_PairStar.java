package recursion;

public class R20_PairStar {

	public static String pair(String str) {
		if(str.length()==1) {
			return str;
		}
		String s=pair(str.substring(1));
		if(str.charAt(0)==str.charAt(1)) {
			return str.charAt(0)+"*"+s;
		}
		else {
			return str.charAt(0)+s;
			}
	}
	public static void main(String[] args) {
		String str="hello";
   System.out.println(pair(str));
	}

}
