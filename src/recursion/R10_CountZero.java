package recursion;

public class R10_CountZero {

	public static int count(int n) {
		if(n<10) {
			if(n==0) {
				return 1;
			}
			else {
			return 0;
		}
		}
		if(n%10==0) {
			return count(n/10)+1;
		}
		else {
			return count(n/10);
		}
		
	}
	public static void main(String[] args) {
		int n=809008;
		System.out.println(count(n));

	}

}
