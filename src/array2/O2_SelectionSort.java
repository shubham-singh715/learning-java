package array2;

public class O2_SelectionSort {

	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void selectionSort(int arr[]) {
			
		for(int i=0;i<arr.length-1;i++) {
			int min=Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex=j;
				}
			}
			int temp= arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
			}
		
		}
	
	public static void main(String[] args) {
		int arr[]= {13,3,5,34,4,0,1,6,2};
   selectionSort(arr);
   printArray(arr);
	}

}
