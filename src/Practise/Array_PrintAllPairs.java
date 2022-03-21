package Practise;

import java.util.Scanner;

public class Array_PrintAllPairs {
	
	public static int[] array() {
		Scanner s= new Scanner(System.in);
	    int n= s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	System.out.println(i+"th no");
	    	arr[i]=s.nextInt();
	    }
		
		return arr;
	}

	 public static void printAllPair(int arr[]) {
		 
		 for (int i=0; i<arr.length; i++) {
			 for (int j=i; j<arr.length -1 ;j++) {
				 System.out.print("("+arr[i]+","+arr[j+1]+")");
			 }
		 }
	 }
	public static void main(String[] args) {
	  int arr[]= array();
	 printAllPair(arr);

	}

}
