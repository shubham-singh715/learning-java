package checkingjava;

public class method {
	//parameter passing and returing vales by calling methods in main method

	public static void main(String[] args) {
		
		MyFirstMethod();
		MyFirstMethod();
		sayHello("amit");
		sayHello("john");
		sayHello("rahul");
		Add (100,200,2);
		
     int sum = multi (28,2,3);
     System.out.println(sum);
     
     int ok = sum + 10;
     System.out.println(ok);
     
     System.out.println(multi(2,3,4));
     // we can use the return value and use it anywhere in main method as we used sum 
		
	}
       public static void MyFirstMethod () {   
    	   System.out.println("hello world");
    	   // Method makes your code look clean as you dont have to write syso"hello world" again and again
    	   
       }
       public static void sayHello(String name) {
       
    	   System.out.println("Hello " + name );
       }
      public static void Add (int a, int b, int c) {
    	  
    	  System.out.println(a+b*c);
    	  
      }
      public static int multi  (int a, int b, int c) {
    	  
      return (a*b*c);
      }
}
