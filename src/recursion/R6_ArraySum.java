package recursion;

public class R6_ArraySum {

	/*public static int arraySum(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int arr2[]=new int [arr.length-1];
		for(int i=1;i<arr.length;i++) {
			arr2[i-1]=arr[i];
		}
		return arraySum(arr2)+arr[0];
	}*/
	
	public static int array(int arr[],int startIndex) {
		if(startIndex==arr.length-1) {
			return arr[startIndex];
		}
		return array(arr,startIndex+1)+arr[startIndex];
	}
	
	public static int array(int arr[]) {
		return array(arr,0);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(array(arr));
		

	}

}
