package recursion;

public class R4_FibonacciNumber {
 /* Identify the fibonacci number at nth place(0,1,1,2,3,5,8,....) at 3rd place is 2. at 0th place 0*/
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println(fib(n));
	}

}
