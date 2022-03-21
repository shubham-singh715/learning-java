package loop;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
	
		 long factorial =1;
		for (long i=n ; i>=1 ; i--)
		{
		factorial= factorial *i;
		
		
		}
		System.out.println(factorial);
	}

}
