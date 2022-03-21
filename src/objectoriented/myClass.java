package objectoriented;

public class myClass {

	public static void main(String[] args) {
		
		Student raj = new Student();    // raj-> object or instance
		
		/* we could have used raj.setId(1) as raj.Id =2 but it would be accessible by anyone ;
		 * but now after using getter and setter no one can access. 
		 */
		raj.setId(1);
		raj.setName("Raj");
		raj.setAge(16);
		
        Student ram = new Student();
		
        ram.setId(2);
        ram.setName("ram");
        ram.setAge(18);
		
		System.out.println(raj.getName() + " is " + raj.getAge() + " years old ");
		System.out.println(ram.getName() + " is " + ram.getAge() + " years old ");
		
         Cube cube1 =new Cube();       // Cube() is a constructor. We can define a contructor or it be predefined
         System.out.println(cube1.VolumeOfCube());
         
         Cube cube2 = new Cube(3,4,5);
         System.out.println(cube2.VolumeOfCube());
         
         Cube cube3 =new Cube("Shubham");
         
	}

}
