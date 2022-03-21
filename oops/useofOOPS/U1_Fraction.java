package useofOOPS;



public class U1_Fraction {

	int denominator;
    int numerator;
    
    public void print() { //To print the fraction
    	System.out.println(this.numerator+ "/"+this.denominator);
    }
    
        U1_Fraction(int numerator,int denominator) {  //To make object of fraction
    	this.numerator= numerator;
    	this.denominator= denominator;
    	simplyfy();
    }
        
        private void simplyfy() {  //To simplyfy the fraction
        	int smaller= Math.min(numerator, denominator);
        	int gd=0;
        	for(int i=2;i<=smaller;i++) {
        		if(numerator%i==0 && denominator%i==0) {
        			gd=i;
        		}
        	}
        	if(gd==0) {
        		return;
        	}
        	numerator=numerator/gd;
        	denominator=denominator/gd;
        }
        
      public void increment() { //Increment fraction by 1. This is object function .
 
    	 numerator= numerator+denominator;
    	 
    	 simplyfy();
      }
      
   public void add(U1_Fraction f2) {   // To add 2 fractions by object function. 
	   this.numerator=	this.numerator * f2.denominator + f2.numerator * this.denominator;
	   	this.denominator= this.denominator * f2.denominator;
		
		simplyfy();
   }
   
   public static U1_Fraction add(U1_Fraction f1, U1_Fraction f2) { // To add 2 fractions by class function. 
	   int newnum =f1.numerator * f2.denominator + f2.numerator * f1.denominator;
	   int newdeno= f1.denominator * f2.denominator;
	   
	   U1_Fraction f3 = new U1_Fraction(newnum, newdeno);
	   return f3;
   }
}
