package array2;


public class A3_BubbleSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
 int arr[]= {3,5,2,4,1};
 bubbleSort(arr);
 printArray(arr);
  

	}

}
