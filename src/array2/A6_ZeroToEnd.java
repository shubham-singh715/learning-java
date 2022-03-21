package array2;

public class A6_ZeroToEnd {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void toEnd(int[] arr) {
		int n=arr.length;
		int non_Zero=0;
		for(int i=0; i<n;i++) {
			if(arr[i]!=0) {
				int temp =arr[i];
				arr[i]=arr[non_Zero];
				arr[non_Zero]=temp;
				non_Zero++;
			}
		}
	}
	
	public static void main(String[] args) {
/*You have been required to push all the zeros that are present in the array/list to the end of it. 
	Also, make sure to maintain the relative order of the non-zero elements.
*/
		int[] arr= {2,0,0,1,3,0,0};
		toEnd(arr);
		printArray(arr);
	}

}
