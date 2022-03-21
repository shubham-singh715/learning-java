package array2;
import java.util.ArrayList;
import java.util.Arrays;
public class A8_ArrayIntersection_TimeComplexity {
	/*
	 * Brute force method by selecting each element of array1(size m) and doing linear search on 
	 * 2nd array (size n) will have time complexity O(m*n).
	 * So we are soring the array and using other approch which will give O(nlogn +mlogm).     
	 */

	public static void arrayIntersection(int arr1[],int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
       while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]+ " ");
				i++; j++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
	}
	public static void main(String[] args) {
	
		int arr1[]= {2,6,1,2};
		int arr2[]= {1,2,3,4,2};
		System.out.println();
		arrayIntersection(arr1,arr2);
	}

}
