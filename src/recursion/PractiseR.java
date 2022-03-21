package recursion;

public class PractiseR {

	public static int s(int n) {
		if(n<10) {
			return n;
		}
		return s(n/10)+n%10;
	}
	public static void main(String[] args) {
		int n=123454;
  System.out.println(s(n));
	}

}
