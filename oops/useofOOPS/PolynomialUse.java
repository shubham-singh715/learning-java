package useofOOPS;

public class PolynomialUse {

	public static void main(String[] args) {
	
		Polynomial p1= new Polynomial();
       p1.setCoefficient(2, 5);
       p1.setCoefficient(3, 4);
       p1.print();
       
       Polynomial p2= new Polynomial();
       p2.setCoefficient(2, 2);
       p2.setCoefficient(3, 5);
      
       p2.print();
        
       Polynomial p3= Polynomial.add(p1, p2);
       p3.print();
       
       Polynomial p4= Polynomial.multiply(p1, p2);
       p4.print();
       
       int ans = p1.evaluate(10);
       System.out.println(ans);
      // System.out.println(p1.getCoefficient(3));
	}

}
