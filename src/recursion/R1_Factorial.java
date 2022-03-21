package recursion;

import java.util.Scanner;

// In any case of recursion , we need to do 3 things: 

public class R1_Factorial {
	public static int fact(int n) {
 
/*STEP 1: Find the base .*/		if(n==0) {
		                      	return 1;
		                         }
 /*STEP 2: Find the smaller problem*/		              int ans=fact(n-1);
 /*STEP 3: How to reach soultion using smaller problem */ return n*ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
		int k=fact(n);
		System.out.println(k);

	}

}
