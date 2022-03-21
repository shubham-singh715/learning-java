package test;

public class Print2DArray {
   /*
    * Given 2D array of n rows and m columns . Print 0th row n times,1st row (n-1) times, 
    * 2nd row (n-2) times, (n-1)th row 1 time.	
    */
	public static void print(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		int p=n;
		for(int i=0;i<=n;i++) {
			for(int k=0;k<p;k++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			p--;
	}
	}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{3,4,5},{7,8,9}};
       print(arr);
	}

}
