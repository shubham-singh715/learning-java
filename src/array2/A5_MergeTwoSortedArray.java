package array2;

public class A5_MergeTwoSortedArray {
	
	public static void printArray(int a3[]) {
		for(int i=0;i<a3.length;i++) {
			System.out.println(a3[i]);
		}
	}

	public static int[] mergeArray(int a1[], int a2[],int a3[]) {
		int m=a1.length,n=a2.length;
		int i=0,j=0,k=0;
		while(i<m && j<n ) {
			
				if(a1[i]<a2[j]) {
					a3[k]=a1[i];
					i++;
					k++;
				}
				if(a2[j]<a1[i]) {
					a3[k]=a2[j];
					j++;
					k++;	
				}	
			}
		while(i<m) {
			a3[k]=a1[i];
			i++;
			k++;
		}
		while(j<n) {
			a3[k]=a2[j];
			j++;
			k++;
			}
		return a3;
		}
		
	
	public static void main(String[] args) {
		int a1[]= {1,5,8,10,13,15};
		int a2[]= {2,3,6,9};
		int a3[]=new int[a1.length+a2.length];
		 mergeArray( a1, a2,a3);
		 printArray(a3);

	}

}
