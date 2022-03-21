package useofOOPS;

public class U4_ComplexUse {

	public static void main(String args[]) {
		
		U3_ComplexNumber c1= new U3_ComplexNumber(5, 3);
		c1.print();
		
		U3_ComplexNumber c2= new U3_ComplexNumber(4, 5);
		c1.add(c2);
		c2.print();
		c1.print();
		
		
		U3_ComplexNumber c3= new U3_ComplexNumber(6, 7);
		
		U3_ComplexNumber c4= U3_ComplexNumber.multiply(c2, c3);
		c2.print();
		c3.print();
		c4.print();
		
		
}
}