package objectAndclasses;

public class O1_Student  {

	/*  This is class or blueprint of a student.
	 *  Properties of student (object) are mentioned below.
	 */
	
	String name;
	private int rollNumber;
	/* As rollNumber is private ,so it cannot be accessed outside the class. So this to be accessed outside
	  this class is using GETTER and SETTER. */
	public int getrollNumber() {
		return rollNumber;
	}
	public void setrollNumber(int num) {
		/* Now roll number can be accessed anywhere. An we can make changes , like roll number should always
		 * a positive integer. And if anyone directly access to rollNumber then he can put any negative
		 * number also. And there would be no error. So we can set some rules in setter. 
		 */
		if(num<0) {
			return ;
		}
		rollNumber=num;
	}
	 
	
	
}
