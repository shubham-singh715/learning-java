package checkingjava;
import java.util.Scanner;
public class ifelse {
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your gender                 (MAle=1, Female=2)");
		int user_gender = scan.nextInt();
	
		
		if (user_gender ==  1) {
			System.out.println("Enter your age");
			Scanner scan1=new Scanner(System.in);
			
			int user_age = scan1.nextInt();
			
			if (user_age > 22 ) {
				
				System.out.println("You are eligible for marridge");
				
			}
			else {
				System.out.println("You cant marry");
			}}
			
			else if (user_gender ==  2) {
				
				Scanner scan2=new Scanner(System.in);
				System.out.println("Enter your age");
				int user_age1 = scan2.nextInt();
				
				if (user_age1 > 18 ) {
					
					System.out.println("You are eligible for marridge");
					
				}
				else {
					System.out.println("You cant marry");
				}
		
			}
		}
	}


