package checkingjava;

import java.util.Scanner;
public class input2 {
	
	public static void main(String[] args){
	
		Scanner scan= new Scanner (System.in);
		System.out.println("ENter a STring");
		String usr= scan.nextLine();
		
		Scanner scan1= new Scanner (System.in);
		System.out.println("ENter your birtdate");
		int user= scan1.nextInt();
		
		System.out.println("Your password is " + usr+user);
		
		
		
		
	}
}
