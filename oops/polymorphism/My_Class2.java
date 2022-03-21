package polymorphism;

public class My_Class2 {

	public static void main(String[] args) {
	
		Bank abc=new Bank_ABC();
		Bank def=new Bank_DEF();
		Bank xyz=new Bank_XYZ();
		
		System.out.println(abc.getIntrestRate());
		System.out.println(def.getIntrestRate());
		System.out.println(xyz.getIntrestRate());
		
		Interface1 inter= new Interface2();
		System.out.println(inter.getName());

	}

}
