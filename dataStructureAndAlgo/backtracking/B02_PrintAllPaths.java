package backtracking;

public class B02_PrintAllPaths {

public static void ratInMaze2(int arr[][]) {
		
		int n=arr.length;
		int path[][]= new int[n][n];
		
		printAllPath(arr, 0, 0, path);
		
	}
	
	public static void printAllPath(int arr[][], int i, int j, int path[][]) {
		
		int n=arr.length;
		if(i < 0 || i>=n || j<0 || j>=n || arr[i][j] == 0 || path[i][j] ==1 ) {
			return;
		}
		
		path[i][j]=1;
		if(i == n-1 && j == n-1) {
			for(int k=0;k<n;k++) {
				for(int l=0;l<n;l++) {
					System.out.print(path[k][l] + " ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j]=0;
			return ;
		}
		
		//top
		printAllPath(arr, i-1, j, path);
		
		//right
		printAllPath(arr, i, j+1, path);
		
		//down
		printAllPath(arr, i+1, j, path);
		//left
		printAllPath(arr, i, j-1, path);
		
		path[i][j]=0;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,1,1},{1,1,0},{1,1,1}};
		
		ratInMaze2(arr);

	}

}
