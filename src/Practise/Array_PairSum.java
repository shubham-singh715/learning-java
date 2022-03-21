package Practise;

public class Array_PairSum {

	public static int pairSum(int arr[] , int c) {
		int temp =0;
		for (int i=0;i<arr.length;i++) {
			for (int j = i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==c) {
					temp=temp+1;
				}
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		int arr[] = {2 ,8 ,10 ,5 ,-2 ,5};
		int c=10;
        int x = pairSum(arr,c);
        System.out.println(x);
		
	}

}
