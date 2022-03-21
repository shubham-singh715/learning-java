package array2;

public class Practisearray {
	
	 static int countPairs(int a[], int n, int k) {
	       int i=0;
	        int j=1;
	        int temp=0;
	        while(i<j){
	            if(a[i]+a[j]>k){
	                temp=temp+1;
	            j++;
	            i++;
	            }
//	            if(j==a.length-1){
//	                i++;
//	                j=1;
//	            }
	        }
	        return temp;
	    }

	public static void main(String[] args) {
    int a[] = {1,4,2,1};
    System.out.println(countPairs(a, 4, 4));

	}

}
