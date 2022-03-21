package loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("ENter your number");
		
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		boolean isPrime = true;
		for (int i=2 ; i<n ; i++)
		{
			if( n% i == 0)
				
			isPrime= false;
			break;
		
			}
		System.out.println(isPrime);
	}
}
