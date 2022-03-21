package checkingjava2;

public class HandlingException {
/*An exception is an event which occurs during the execution of a program 
 *  that disrupts the normal flow of program's instructions.
 */
	public static void main(String[] args) {
		int a[] = new int [3];
		// So this would be an error or exception cause we are asking for 5th element in an array of 3
				// so we will use try catch
	try {	
		System.out.println(a[5]);
	} catch (Exception e) {
		//try and catch remove the exception and you can move forward in your code. Otherwise if an exception
		//occurs then rest of the code will also be not done. 
		System.out.println(e);
		
	}
	System.out.println("----------------------------------------------------------------");
	//this line would have not been printed if we hadn't used try and catch
		

	}

}
