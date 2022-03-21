package array2;

public class A9_EquilibriumIndex {
	/*If sum of values before index i and after i are equal the i is considered equilibrium index.
	 * We can use brute force method by selecting each index and calculating sum before and after each index.
	 * That will have time complexity O(n2). So we are using better solution.
	 */

	public static int sumofArray(int arr[]) {
		int rightsum=0;
		for(int i=0;i<arr.length;i++) {
			rightsum+=arr[i];
		}
		return rightsum;
	}
	public static int equilibriumIndex(int arr[], int rightsum) {
		int leftsum=0;
		for(int i=0;i<arr.length;i++) {
			if(rightsum-arr[i]==leftsum) {
				return i;
			}
			else {
				leftsum+=arr[i];
				rightsum-=arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	  int arr[]= {1 ,4 ,9 ,3 ,2};
	 int n= sumofArray(arr);
	 int s= equilibriumIndex(arr,n);
   System.out.println(s);
	}

}
