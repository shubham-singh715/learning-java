package array2;


public class A4_InsertionSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				else {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
 int arr[]= {9,7,6,8,4,5,2,3};
 insertionSort(arr);
 printArray(arr);
  

	}

}
