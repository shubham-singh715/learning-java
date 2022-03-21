package useofOOPS;

public class U3_ComplexNumber {

	int realNum;
	int imaginaryNum;
	
	public void print() {
		System.out.println(this.realNum + " + i" + this.imaginaryNum);
	}
	
	
	public U3_ComplexNumber(int real, int imag) {
		this.realNum=real;
		this.imaginaryNum=imag;
	}
	
	
	public void add(U3_ComplexNumber c2) {
		this.realNum= this.realNum +c2.realNum;
		this.imaginaryNum =this.imaginaryNum +c2.imaginaryNum;
	}


	public static U3_ComplexNumber multiply(U3_ComplexNumber c2 , U3_ComplexNumber c3) {
		int imagNum = c3.realNum*c2.imaginaryNum +c3.imaginaryNum*c2.realNum;
		int realN= c3.realNum * c2.realNum - c3.imaginaryNum*c2.imaginaryNum;
		U3_ComplexNumber c4= new U3_ComplexNumber(realN, imagNum);
		return c4;
	}
}
