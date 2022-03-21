package recursion;

public class R11_GeometricSum {
	/*Given k, find the geometric sum i.e. 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) using recursion.
*/
	public static int power(int n) {
		if(n==0) {
			return 1;
		}
		return power(n-1)*2;
	}
	public static float sum(int n) {
		if(n==0) {
			return 1;
		}
		return (float) (sum(n-1)+1/Math.pow(2, n));
	}
	public static void main(String[] args) {
	int n=3;
	System.out.println(sum(n));

	}

}
