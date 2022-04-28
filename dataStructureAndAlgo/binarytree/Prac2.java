package binarytree;

public class Prac2 {

	  Prac prac;
	public void abc() {

		 prac = new Prac();
		prac.setData(1);
		prac.setCata(2);
		prac.setC("abc");
		
	}
	
	public void abcd() {
		System.out.println(prac.getData());
	}
	
	public static void main(String args[]) {
	Prac2 prac2= new Prac2();
	
	prac2.abc();
	prac2.abcd();
	
	}

}
