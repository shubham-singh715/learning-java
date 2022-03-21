package recursion;

public class R17_QuickSort {

	public static int partition(int arr[], int si, int ei) {
		int pivot=arr[si];
		int count=0;
		for(int i=si+1;i<=ei;i++) {
			if(pivot>=arr[i]) {
				count+=1;
			}
		}
		int pivotpos=count+si;
		arr[si]=arr[pivotpos];
		arr[pivotpos]=pivot;
		int i=si,j=ei;
		while(i<pivotpos && j>pivotpos) {
			if(arr[i]<=arr[pivotpos]) {
				i++;
			}
			if(arr[j]>=arr[pivotpos]) {
				j--;
			}
			if(arr[i]>arr[pivotpos] && arr[j]<arr[pivotpos]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++; j--;
			}
		}
		return pivotpos;		
	}
	public static void quickSort(int arr[],int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pivot =partition(arr,si,ei);
		quickSort(arr, si, pivot-1);
		quickSort(arr, pivot+1, ei);
	}
	public static void main(String[] args) {
		int arr[]= {6,0,5,4,20,3,2,};
     quickSort(arr, 0, arr.length-1);
     for(int i=0;i<arr.length;i++) {
    	 System.out.print(arr[i]+" ");
     }
	}

}
