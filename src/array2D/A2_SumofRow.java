package array2D;

public class A2_SumofRow {
	public static void sum(int arr[][]) {
		int rows=arr.length;
		
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2},{4,5,1},{6},{1,9,3,5,2}};
        sum(arr);
	}

}
