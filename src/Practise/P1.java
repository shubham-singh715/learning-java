package Practise;

public class P1 {
	
	public static void merge(int a[], int b[],int arr[]) {
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length ) {
			if(a[i]<b[j]){
				arr[k]=a[i];
				i++;
				k++;
				}
			else {
				arr[k]=b[j];
				j++;
				k++;
			}
			}
		while (i<a.length) {
			arr[k]=a[i];
			i++; k++;
		}
		while(j<b.length) {
			arr[k]=b[j];
			j++; k++;
		}
		 
	}
	
    public static void sort(int arr[]) {
    	if(arr.length<=1) {
    		return;
    	}
    	int mid =arr.length/2;
    	int a[]=new int[mid];
    	int b[]=new int[arr.length-mid];
    	for(int i=0;i<mid;i++) {
    		a[i]=arr[i];
    	}
    	int m=0;
    	for(int i=mid;i<arr.length;i++) {
    		b[m]=arr[i];
    		m++;
    	}
    	sort(a);
    	sort(b);
    	merge(a,b,arr);
    	
    }
	public static void main(String[] args) {
		int arr[]= {4,7,2,3,9,8,1,10};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
    }
}
