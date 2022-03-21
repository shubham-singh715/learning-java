package recursion;

public class R5_CheckSortedArray {
 //This method consumes much space as we are creating a new array in every recursion 
	public static boolean checkSorted(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int arr2[] =new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			arr2[i-1]=arr[i];
		}
		boolean s= checkSorted(arr2);
		return s;
	}
	
	/*So, a better method is used.Here, we dont creater new array, we just mover index from start to end.
	startIndex is done by ourself and user doesnt know about it. So we will create another function for 
	inserting start index which only we know.
	*/
	public static boolean checkSortedBetter(int arr[], int startIndex) {
		if(startIndex==arr.length-1) {
			return true;
		}
		if(arr[startIndex]>arr[startIndex+1]) {
			return false;
		}
		boolean s= checkSortedBetter(arr, startIndex+1);
		return s;
	}
	
	public static boolean checkSortedBetter(int arr[]) {
		return checkSortedBetter(arr,0);
	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,5};
		System.out.println(checkSortedBetter(arr));

	}

}
