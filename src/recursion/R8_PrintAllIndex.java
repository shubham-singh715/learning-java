package recursion;

public class R8_PrintAllIndex {
	public static void printarray(int output[]) {
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i]+ " ");
		}
	}
	public static int[] print(int arr[],int n,int startIndex) {
		if(startIndex==arr.length) {
			int output[]=new int[0];
		    return output;
		}
		int output[]=print(arr,n,startIndex+1);
		if(arr[startIndex]==n) {
		    int newoutput[]=new int[output.length+1];
		    newoutput[0]=startIndex;
		    for(int i=0;i<output.length;i++) {
		    	newoutput[i+1]=output[i];
		    }
		    return newoutput;
		}	
		else {
			return output;
		}
	}
	public static int[] print(int arr[], int n) {
		return print(arr,n,0);
	}

	public static void main(String[] args) {
	int arr[]= {9,8,10,8,8};
	int n=8;
	int output[]=print(arr,n);
     printarray(output);
	}

}
