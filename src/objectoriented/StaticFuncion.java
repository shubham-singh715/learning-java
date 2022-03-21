package objectoriented;

public class StaticFuncion {
	/* If we want to call a static method from another class then it should be called by class name and not 
	 by the object or instance. for eg;
	 
	  method:1) public static int add(int a,int b)
	            return (a+b)
	            
	          2)  public int addition( int a, int b)
	            return( a+b)
	                        
	            1)            Cube cube1 =new Cube();
	                          Cube.add(3,4)
	                          
	            2)            Cube cube2= new Cube();
	                          cube2.addition(2,3);                                        
	  */
	int age;
	String name;
	static int NoOfStudents =0;
      
	StaticFuncion () {
		NoOfStudents++;
	}
	public static int getNoOfStudents() {
	   return NoOfStudents;
}
}
	
