package recursion;

public class R16_MergeSort {

	public static void merge(int arr[],int si,int ei){
		int mid=(si+ei)/2;
		int arr2[]=new int [arr.length];
		int k=0,i=si,j=mid+1;
		while(i <=mid && j<=ei ) {
			if(arr[i]<=arr[j]) {
				arr2[k]=arr[i];
				i++;
				k++;
			}
			else {
				arr2[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			arr2[k]=arr[i];
			i++; k++;
		}
		while(j<=ei) {
			arr2[k]=arr[j];
			j++; k++;
		}
		int m=0;
		for(int q=si;q<=ei;q++) {
			arr[q]=arr2[m];
			m++;
		}
	}
	public static void sort(int arr[],int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mid=(si+ei)/2;
		sort(arr,si,mid);
		sort(arr, mid+1, ei);
		merge(arr,si,ei);
		
	}

	
	public static void main(String[] args) {
		int arr[]= {6,5,4,3,2,1};
		sort(arr, 0, arr.length-1);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }

	}

}
			