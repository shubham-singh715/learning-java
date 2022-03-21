package objectAndclasses;

/*
 * As we use extends then the properties of later written class is inherited or taken in before written class.
 * In this properties of O3_Student's properties are inherited in O3_This class.
 * So when an object is made from O3_This , then it will have properties of )3_Student.
 * But viceversa is not possible. 
 */
public class O3_This  {

	/*
	 * This is very important as it differentiates between the local variable and the object variable.
	 * As in setAddress we can see name of both local and object variable are same .
	 * So this keyword tells jvm that the selected variable is of object which calls the variable.
	 * As s1.getAddress is called , this keywork identifies s1 and gives "address" or reference of s1.
	 * So basically this keyword is reference or adress of the object.
	 */
	private String address;
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
}
