 package Practise;

public class Array_FindDuplicate {

//	You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
//	Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from
//	0 to 3 and among these, there is a single integer value that is present twice. 
//	You need to find and return that duplicate number present in the array.
			
	public static void findDuplicate(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
					   System.out.println(arr[i]);
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {6,2,3,4,5,6};
		
    findDuplicate(arr);
	}

}
