package array2D;
import java.util.Scanner;
public class TakingInput {
	public static void print(int arr[][]) {
		int rows=arr.length;
		int columns=arr[0].length;
		  for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<columns;j++) {
	    		  System.out.print(arr[i][j] + " ");
	    	  }
	    	  System.out.println();
	      }
	}

	public static int[][] takeInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of rows");
		int rows=sc.nextInt();
		System.out.println("No. of columns");
		int columns=sc.nextInt();
		int arr[][]=new int [rows][columns];
        
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter "+i+" row "+j+" column ");
			  arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
	int arr[][]=takeInput();
	print(arr);
    
	}

}
