package checkingjava2;

public class Recursion {

	/// we will find factorial for understANDING RECURSION.
	
	public static int factorial(int N) {
		if (N <= 1)
			return 1;
		else return (N * factorial(N-1));
		
		
			// So recurion is a technique of using a method in that method only.
		// Just like we used factorial method in its method itself
		
			
	}
	
	
	
	public static void main(String[] args) {
	System.out.println(factorial(4));

	}

}
