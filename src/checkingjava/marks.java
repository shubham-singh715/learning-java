package checkingjava;

import java.util.Scanner;
public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Enter your CGPA");
		
	Scanner scan= new Scanner(System.in);
	int my_marks = scan.nextInt();
	
	switch(my_marks) {
	
	case 10 :
		System.out.println("excellent");
		break;
	case 9:
		System.out.println("good");
	    break;
	case 7:
	case 8:
	case 6:
		System.out.println("average");
		break;
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
		System.out.println("Fail");
		break;
		
	} */

		
		System.out.println("1-Addition       2-Subtraction       3:Multiplicstion     4:Division");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number - 1,2,3,4");
		int value= input.nextInt();
		
		switch (value) {
		
		case 1:
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int value1= input1.nextInt();
		
		Scanner input11 = new Scanner(System.in);
		System.out.println("Enter your 2nd number");
		int value11= input11.nextInt();
		
		int answer = value1 + value11 ;
		
		System.out.println("Answer" + answer);
		
		break;
		
		case 2:
			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter your 1st number");
			int value2= input2.nextInt();
			
			Scanner input22 = new Scanner(System.in);
			System.out.println("Enter your 2nd number");
			int value22= input22.nextInt();
			
			int answer2 = value2 - value22 ;
			
			System.out.println("Answer" + answer2);
			
			break;
			
		case 3:
			Scanner input3 = new Scanner(System.in);
			System.out.println("Enter your 1st number");
			int value3= input3.nextInt();
			
			Scanner input33 = new Scanner(System.in);
			System.out.println("Enter your 2nd number");
			int value33= input33.nextInt();
			
			int answer3 = value3 * value33 ;
			
			System.out.println("Answer" + answer3);
			
			break;
			
		case 4:
			Scanner input4 = new Scanner(System.in);
			System.out.println("Enter your 1st number");
			int value4= input4.nextInt();
			
			Scanner input44 = new Scanner(System.in);
			System.out.println("Enter your 2nd number");
			int value44= input44.nextInt();
			
			int answer4 = value4 / value44 ;
			
			System.out.println("Answer" + answer4);
			
			break;
		
		
		}
		
	}

}
