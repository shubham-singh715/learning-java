package useofOOPS;

public class U2_FractionUse {

	public static void main(String[] args) {
		U1_Fraction f1 = new U1_Fraction(4,6);
		f1.print();
//		f1.increment();
		f1.print();
		
	U1_Fraction f2 = new U1_Fraction(4,8);
		
	
//	f1.add(f2);
//	f1.print();
		
	U1_Fraction f3= U1_Fraction.add(f1, f2);
	f3.print();
	}


}
