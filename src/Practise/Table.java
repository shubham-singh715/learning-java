package Practise;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no.");
		int n= sc.nextInt();
	
	
		for(int i=1; i<=10 ; i++) {
			
			int sum = n*i;
			

			System.out.println( sum);
			
		}
		
	}

}
