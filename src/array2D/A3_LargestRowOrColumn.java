package array2D;

public class A3_LargestRowOrColumn {

	public static void largest(int arr[][]) {
		int rows=arr.length;
		int col=arr[0].length;
		int largest=Integer.MIN_VALUE;
		int temp=0;
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
			}
			if(sum>largest) {
				largest= sum;
				temp=i;
			}
		}
		int temp1=0;
		int largest1=Integer.MIN_VALUE;
		for(int i=0;i<col;i++) {
			int sum=0;
			for(int j=0;j<rows;j++) {
				sum=sum+arr[j][i];
			}
			if(sum>largest1) {
				largest1= sum;
			   temp1=i;
			}
		}
		if(largest>largest1) {
	   System.out.println("row "+ temp +" "+largest);
		}
		else {
			 System.out.println("row "+ temp1 +" "+largest1);
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{3,4,5},{8,8,8}};
		
         largest(arr);
         
       
	}

}
