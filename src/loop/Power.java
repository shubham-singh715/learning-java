package loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		System.out.println("Enter base no.");
		Scanner sc= new Scanner (System.in);
		int x= sc.nextInt();
		System.out.println("Enter power no.");
		Scanner sc1= new Scanner (System.in);
		int y= sc1.nextInt();
		
		int temp=x;
		for (int i=1; i<y ; i++)
		{
			temp = temp *x;
		}
		System.out.println(temp);
		
	}

}
