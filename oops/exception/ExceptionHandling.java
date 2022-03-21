package exception;

public class ExceptionHandling {
	public static int fact(int i) throws NegativeNumberException {
		if(i<0) {
			throw new NegativeNumberException();
		}
		if(i==1) {
			return 1;
		}
		return fact(i-1)*i;
	}

	public static int divide(int a, int b) throws DividedByZeroException{
		if(b==0) {
		/* Here the exception needs to be handled.So, divide method throws exception at the method
		   which has called divide i.e main method. 
		*/
			throw new DividedByZeroException();
		}
		return a/b;
	}
	
	public static void main(String[] args)   {
		/*
		 * Here the exception has been thrown to main. Now main can either handle exception by try catch
		 * or it can throw to user (which is displayed on runtime ).Throw part can be done same which was seen
		 * in divide. Here we are seeing try catch. 
		 */
		
		/*
		 * By using try catch the other operations in main method after the exception x can be executed,
		 * unlike in throwing exception.
		 */
		
		int k;
		int c;
		/*
		 * One try can be used for different operations where exception can happen.
		 * And for each exception catch can be made. But if any one of exception or error is made ,
		 * then the correct exception will also be not printed. So different try for each catch should be made.
		 */
		try {
			k = divide(8,2);
			c=fact(3);
			System.out.println(k);
			System.out.println(c);
		} catch (DividedByZeroException e) {
			System.out.println("Denomintor can't be zero");
			//e.printStackTrace();
		}catch(NegativeNumberException e) {
			System.out.println("Number is negative");
		}
         
		
	}

}
