package function;

import java .util.Scanner; 
public class SumOfArray {
	
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
	
//	public static int sumofArrays(int arr[]) {
//		int n= arr.length;
//		int sum=0;
//		for (int i=0 ; i<n ; i++) {
//			sum = sum+ arr[i];
//		}
//		return sum;
//	}

	public static void main(String[] args) {
		int arr[]= inputArray();
		int arr1[]=inputArray();
		
//		int sum = sumofArrays( arr);
		
//		System.out.println("Sum of arrays ="+ sum);
		

	}

}
