package function;

import java.util.Scanner;

public class FarenheitToCelsiusTable {
	
	public static void printFahrenheitValue(int start, int end, int step ) {
		
		while(start <=end) {
			double fahrenheit =  (5.0/9)* (start -32);
			System.out.println(fahrenheit);
			start+= step;
		}
		
//		return cel;
		
	}

	public static void main(String[] args) {
		// Celsius Value = (5/9)*(Fahrenheit Value - 32)  
    
	
		Scanner sc = new Scanner (System.in);
		int s= sc.nextInt();
		int e= sc.nextInt();
		int w= sc.nextInt();
		
		
		 printFahrenheitValue(s,e,w);
		

	}

}
