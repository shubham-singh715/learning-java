package function;

import java.util.Scanner;

public class SumOfNumbers {

	public static int sum (int a , int b) {
//		int Sum = a+b;
//		return Sum;
		
		return a+b;
	}
	public static void main(String[] args) {
	
   Scanner sc= new Scanner (System.in);
   int a = sc.nextInt();
   int b= sc.nextInt();
    
   System.out.println(sum(a,b));
	}

}
