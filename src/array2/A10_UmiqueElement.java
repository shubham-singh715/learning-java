package array2;
import java.util.Arrays;
public class A10_UmiqueElement {
	/*
	 * You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
      Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
      You need to find and return that number which is unique in the array/list.
      
        There is also the best approach using XOR. a^a =0 or a XOR a=0.
        eg. 2^3^1^6^3^6^2 will return 1 as all other are same.
        int xor=0;
        for(int i=0;i<arr.length;i++){
        xor^=arr[i];
        }
        return xor;
    */
	public static int unique(int arr[]) {
		Arrays.sort(arr);
		int i=0;
		while(i<arr.length){
			if(arr[i]!=arr[i+1] || arr[i]==arr[arr.length-1]) {
				return arr[i];
				
			}
			else if(arr[i]==arr[i+1]) {
				i+=2;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {2 ,3 ,1 ,6 ,3 ,6 ,2};
     System.out.println(unique(arr));
	}

}
