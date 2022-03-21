package Practise;



public class Array_SwapAlternate {
	
	
	 public static void printSwapAlternate(int arr[]) {
		 int i=0;
		 while(i<arr.length) {
			
				 System.out.print("("+arr[i+1]+","+arr[i]+")");
			i+=2;
		 }
	 }
	public static void main(String[] args) {
	  int arr[]= {5,6,7,3,0,9,2,3};
	 printSwapAlternate(arr);

	}

}
