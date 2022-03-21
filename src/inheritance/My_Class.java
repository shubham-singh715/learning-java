package inheritance;

public class My_Class {
           
	/*Classes in java can be extended
	 * creating new classes which retains characteristics of base class. 
	 * Properties of Polygon class are inherited in Rectangle And Triangle classes i.e setvalues and heigh and width
	 */
	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.setValue(20, 10);
		tri.setValue(10, 30);
		
		System.out.println("Area of Rectangle =" + rec.area() );
		System.out.println( "Area of Triangle =" + tri.area());
		

	}

}
