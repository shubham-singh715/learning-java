package useofOOPS;

public class Polynomial {
 
	private int degree;
	private int coefficient;
	U5_DynamicArray d1;
	public Polynomial() {
		d1=new U5_DynamicArray();
	   for(int i=0;i<d1.length();i++) {
		   d1.add(0);
	   }
	}
	
	
	public void setCoefficient(int degree, int coefficient) {
		this.coefficient=coefficient;
		this.degree=degree;
		if(degree>=d1.size()) {
			for(int i=d1.size();i<=degree;i++) {
				d1.add(0);
			}
		}
		d1.set(this.degree, this.coefficient);
	}
	
//	public int getCoefficient(int degree) {
//		if(degree<d1.size()) {
//		return this.d1.get(degree);
//		}
//		else {
//			return 0;
//		}
//	}
	
	public void print() {
		for(int i=0;i<d1.size();i++) {
		if(d1.get(i)!=0) {
			System.out.print(d1.get(i)+"x^"+i+" + ");
		}
	}
		System.out.println();
}

	public static Polynomial add(Polynomial p1, Polynomial p2) {
		Polynomial p3= new Polynomial();
		for(int i=0;i<p1.d1.size()  ;i++) {
			p3.setCoefficient(i,p1.d1.get(i)+p2.d1.get(i));	
		}
		
		return p3;
	}

	public static Polynomial multiply(Polynomial p1, Polynomial p2) {
		Polynomial p4= new Polynomial();
		for(int i=0;i<p1.d1.size();i++) {
			if(p1.d1.get(i)!=0) {
				for(int j=0;j<p2.d1.size();j++) {
					if(p2.d1.get(j)!=0) {
			p4.setCoefficient(i+j, p1.d1.get(i)*p2.d1.get(j)+p4.d1.get((i+j)));
		}
		}
		}
		}
		return p4;
		
	}

	public int evaluate(int j) {
		int ans=0;
		for(int i=0;i<this.d1.size();i++) {
			if(this.d1.get(i)!=0) {
				ans =ans + this.d1.get(i)*(int)Math.pow(j,i );
			}
		}
		return ans;
	}
}