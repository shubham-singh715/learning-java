package recursion;

public class R7_CheckNumberInArray {

	/*public static boolean check(int arr[], int n) {
		if(arr.length==1) {
			if(arr[0]==n) {
				return true;
			}
			else {
				return false;
		}}
		if(arr[0]==n) {
			return true;
		
		}
		int arr2[]=new int [arr.length-1];
		for(int i=1;i<arr.length;i++) {
			arr2[i-1]=arr[i];
		}
		boolean s=check(arr2,n);
		return s;
	}*/
	
	public static boolean checkBetter(int arr[], int n,int startIndex) {
		if(startIndex==arr.length-1) {
			if(arr[startIndex]==n) {
				return true;
			}
			else {
				return false;
			}	
		}
		if(arr[startIndex]==n) {
			return true;
		}
		return checkBetter(arr,n,startIndex+1);
	}
	public static boolean checkBetter(int arr[], int n) {
		return checkBetter(arr,n,0);
	}
	
	public static void main(String[] args) {
		int arr[]= {9,8,10,8};
int n=8;
System.out.println(checkBetter(arr,n));
	}

}
