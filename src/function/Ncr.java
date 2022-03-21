package function;

import java.util.Scanner;

public class Ncr {

	 // nCr formula is n!/(r! * (n-r)!)
	// here we need to calculate factorial of n , r , n-r. Which would be lengthy. So we use function 
	 
	public static int factorial (int num) {
		int fact =1;
		for (int i =1; i<=num ; i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		
     Scanner scan = new Scanner ( System.in);
     int n =scan.nextInt();
     int r =scan.nextInt();
     
     int factN = factorial(n);
     int factR = factorial(r);
     int factNR = factorial(n-r);
     
     int result = factN/(factR * factNR);
System.out.println(result);     
     
	}

}
