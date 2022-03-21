package recursion;

public class R9_MultiplicationUsingAddition {

	public static int multi(int m, int n) {
		if(m==0) {
			return 0;
		}
		return multi(m-1,n)+n;
		
	}
	public static void main(String[] args) {
		int m=3;
		int n=5;
		System.out.println(multi(m,n));

	}

}
