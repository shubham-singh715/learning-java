package objectAndclasses;

public class O2_StudentUse {

	public static void main(String[] args) {
		/*
		 * Here a object is created by using new keyword, and object is stored in heap memory with properties 
		 *  in O1_Student class. But s1 is not the object. s1 is reference of object (has address of object).
		 */   
		
		O1_Student s1= new O1_Student(); 
		String k= s1.name="Shubham Singh";
		s1.setrollNumber(42);
		System.out.print(k+"  "+s1.getrollNumber()+ "      ");
		/* s1 shows adress of object*/System.out.println(s1);
		
		
		O3_This s2= new O3_This();
		s2.setAddress("Ranchi");
		System.out.println( s2.getAddress());
		
		
		O4_Contructor s3=new O4_Contructor("Arvind Singh", 96087);
		s3.print();
		
		O5_Static s4= new O5_Static("Rajesh") ;
		O5_Static s5= new O5_Static("Gangadhar") ;
		System.out.println(s4.nameofStudent+ " "+s4.rollNum);
		System.out.print(s5.nameofStudent+ " "+s5.rollNum);
		System.out.println("   No. of Students = "+O5_Static.getnumOfstudent());	
		
	}

}
