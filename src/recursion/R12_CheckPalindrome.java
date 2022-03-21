package recursion;

public class R12_CheckPalindrome {

	public static boolean check(String str, int startIndex, int endIndex) {
		if(startIndex==endIndex) {
			return true;
		}
		if(startIndex-endIndex==-1) {
			if(str.charAt(startIndex)==str.charAt(endIndex)) {
				return true;
			}
			else {
				return false;
			}
		}
		if(str.charAt(startIndex)!=str.charAt(endIndex)) {
			return false;
		}
		return check(str,startIndex+1,endIndex-1);
	}
	
	public static boolean check(String str) {
		return check(str,0,str.length()-1);
	}
	public static void main(String[] args) {
		String str="racecar";
		System.out.println(check(str));

	}

}
