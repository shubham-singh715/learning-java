package array2;

public class A7_SumOfTwoArray {
	public static void printArray(int arr3[]) {
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
	}
	
	public static void array(int arr,int arr1[], int arr2[],int arr3[],int n ) {
	
		for(int i=n-1; i>=0;i--) {
			arr3[i]= arr%10;
			arr=arr/10;
		}
	}
	
	public static int sumofArray(int arr1[], int arr2[]) {
		int i=arr1.length-1,j=arr2.length-1;
		int arr=0;
		int x=1;
		while(i>=0 && j>=0) {
			arr =(arr1[i]+arr2[j])*x+arr;
			x=x*10;
			i--;
			j--;
		}
		while (i>=0) {
			arr=arr1[i]*x+arr;
			x=x*10;
			i--;
		}
		while (j>=0) {
			arr=arr1[j]*x+arr;
			x=x*10;
			j--;
		}
	return arr;
	}

	public static void main(String[] args) {
	int arr1[]	= {9 ,7 ,6, 1};	
	
	int arr2[]	= {9,2,4};
	
	int n= Math.max(arr1.length,arr2.length);
	
	int arr3[]=new int[n];
	int arr= sumofArray(arr1,arr2);
	array(arr,arr1,arr2,arr3,n);
	printArray(arr3);
	
	}
}


 /*        Different method
      public static void sumofArray(int arr1[],int arr2[] ,int arr3[],int n){
      int i=arr1.length-1,j=arr2.length-1;
		int carry=0;
		int x=n-1;
		while(i>=0 && j>=0) {
		int	arr =arr1[i]+arr2[j]+carry;
			arr3[x]=arr%10;
			carry=arr/10;
			x--; i--; j--;
		}
			while (i>=0) {
		int	arr=arr1[i]+carry;
			arr3[x]=arr%10;
			carry=arr/10;
			x--;
			i--;
		}
		while (j>=0) {
		int	arr=arr2[j]+carry;
			arr3[x]=arr%10;
			carry=arr/10;
			x--;
			j--;
		}
		}
}
*/