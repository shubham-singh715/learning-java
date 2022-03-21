package checkingjava;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		
		int[] array1 = {100,300,400,600,1600};
//Linear Search- Is the number in the array or not
		for (int i=0; i<5; i++) {
			if(array1[i] == 400) {
				System.out.println(i);
			}		
		}
		System.out.println(array1[3]);
		
//Input and display of array
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of array");
		int n = s.nextInt();
		
		int [] arr = new int [n];
		
		for (int i=0 ;i<n ; i++) {
		   System.out.println("Enter "+ i + "th element ");
		   
		   arr[i]=s.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.print("{" + arr[i] +"}");
		}
		
		
	}


}
