package array2;

public class A11_MaximiseTheSum {

	public static int maximise(int arr1[],int arr2[]) {
		int max=0;
		int s1=0,s2=0;
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				s1+=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				s2+=arr2[j];
				j++;
			}
			else {
				s1+=arr1[i];
				s2+=arr2[j];
				
				if(s1>=s2) {
					max+=s1;
				}
				else {
					max+=s2;
				}
				s1=0; s2=0;
				i++; j++;
			}
		}
		while(i<arr1.length) {
			max+=arr1[i];
			i++;
		}
		while(j<arr2.length) {
			max+=arr2[j];
			j++;
		}
		return max;
	}
	public static void main(String[] args) {
	int arr1[]={1 ,5 ,10, 15, 20 ,25};	
	int arr2[]	= {2 ,4 ,5 ,9 ,15,};

	int k=maximise(arr1,arr2);
	System.out.println(k);
	}

}
