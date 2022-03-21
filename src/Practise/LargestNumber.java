package Practise;

import java.util.Scanner;

public class LargestNumber {

	public static int greatestArray(int arr[]) {
		int n=arr.length;
		int max= 0;
		for( int i=0; i<n;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			
			
		}
		return max;
	}
	 
	public static void main(String[] args) {
		System.out.println("enter no of elements");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		
		int arr[]= new int [n];
		for (int i=0; i<n;i++) {
			System.out.println("enter "+ i + "element");
			arr [i]= s.nextInt();
		}
     
		int max = greatestArray(arr);
		System.out.println(max);
		
	}

}
