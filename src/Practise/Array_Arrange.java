package Practise;

import java.util.Scanner;

public class Array_Arrange {
	
	public static int[] inputArray() {
		System.out.println("No of elements in array");
		Scanner s =new Scanner (System.in);
		int n= s.nextInt();
		
		int arr[] = new int[n];
		for (int i=0;i<n; i++) {
			System.out.println("Enter " + i+"th element");
			arr[i]= s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[]= inputArray();
		int n=arr.length;
		int i=0;
		while(i<n) {
			System.out.print(arr[i]);
			i=i+2;
			
		}
		
	}

}
