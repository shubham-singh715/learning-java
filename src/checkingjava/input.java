package checkingjava;

import java.util.Scanner;
public class input {

	 public static void main (String[] args) {
		 
		 Scanner inpuut= new Scanner (System.in);
		 System.out.println("Enter a number");
		 int user_input= inpuut.nextInt();
		  
		 Scanner user1= new Scanner (System.in);
		 System.out.println("enter 2nd no.");
		 int user12= user1.nextInt();
		 
		 int[] array= {user_input, user12};
		 System.out.println(array.length);
		 
		 int x=user_input+ user12;
		System.out.println(x);
			 
		Scanner ram =new Scanner (System.in);
		System.out.println("enter your name");
		String ramu= ram.nextLine();
		
		System.out.println(x + ramu);
	
		
		 
	 }
}
