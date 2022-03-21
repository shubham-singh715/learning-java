package recursion;

public class R15_RemoveDuplicateRecusively {

	public static String duplicate(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
		return	duplicate(str.substring(1));
		}
		else {
		String smallAns= duplicate(str.substring(1));
		return smallAns+str.charAt(0);
	}
	}
	public static void main(String[] args) {
		String str="aabbcdddaaaa";
    System.out.println(duplicate(str));
	}

}
