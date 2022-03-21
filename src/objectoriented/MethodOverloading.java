package objectoriented;

public class MethodOverloading {

	public static void main(String[] args) {
		
		// In method overloading we can use same method name several times in a program by changing the dataype
		
		System.out.println(Add(25,78));
		System.out.println(Add(56.655,78.444));
		System.out.println(Add("Hare", " Krishna"));
	}
		
		public static int Add (int a, int b) {
			
			return (a+b);
		}
	
public static double Add (double a, double b) {
			
			return (a+b);
		}
public static String Add (String a, String b) {
	
	return (a+b);
}

}
