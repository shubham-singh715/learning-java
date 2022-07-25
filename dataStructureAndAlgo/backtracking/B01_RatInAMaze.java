package backtracking;

public class B01_RatInAMaze {
	
	//You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e.
	//maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
	//Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter 
	//into those cells and those with value 1 are open.


	public static boolean ratInMaze(int arr[][]) {
		
		int n=arr.length;
		int path[][]= new int[n][n];
		
		return solveProblem(arr, 0, 0, path);
		
	}
	
	public static boolean solveProblem(int arr[][], int i, int j, int path[][]) {
		
		//Check if i,j is a valid cell.
		int n=arr.length;
		if(i < 0 || i>=n || j<0 || j>=n || arr[i][j] == 0 || path[i][j] ==1 ) {
			return false;
		}
		
		//Check if cell is destination
		path[i][j]=1;
		if(i == n-1 && j == n-1) {
			for(int k=0;k<n;k++) {
				for(int l=0;l<n;l++) {
					System.out.print(path[k][l] + " ");
				}
				System.out.println();
			}
			System.out.println();
			return true;
		}
		
		//If not destination then check further
		//top
		if(solveProblem(arr, i-1, j, path)) {
			return true;
		}
		
		//right
		if(solveProblem(arr, i, j+1, path)) {
			return true;
		}
		
		//down
		if(solveProblem(arr, i+1, j, path)) {
			return true;
		}
		
		//left
		if(solveProblem(arr, i, j-1, path)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,0,1},{1,0,0},{1,1,1}};
		
		System.out.println(ratInMaze(arr));

	}

}
