package objectoriented;

public class MyClass2 {

	public static void main(String[] args) {
		
		StaticFuncion tom = new StaticFuncion();
		StaticFuncion mark = new StaticFuncion();
		StaticFuncion abhi = new StaticFuncion();
		StaticFuncion raju = new StaticFuncion();
		System.out.println(StaticFuncion.getNoOfStudents());
		
		//As we can see we dont have to write specific objects i.e tom and mark for no of students. We just 
		// used the class name which is benfit of static function
		

		 //use of final keyword from accessmodifier class
		
		AccessModifiers acc= new AccessModifiers();
		
		
		// acc.number is showing wrong becasue number can be only used once amd hads been used in previous class 
	}
	

}
