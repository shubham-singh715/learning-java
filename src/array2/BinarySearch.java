package array2;

public class BinarySearch {

	public static int binarySearch(int arr[] , int a) {
		int s=0 , e=arr.length -1 ,mid;
		
		while(s<=e) {	
			mid=(s+e)/2;	
		if(arr[mid]>a) {
			e=mid-1;
		}
		else if(arr[mid]<a) {
			s=mid+1;
		}
		else if(arr[mid]==a){
			return mid;
		}
		}
		
		 return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int a= 2;
    
		System.out.println(binarySearch(arr,a));

	}

}
