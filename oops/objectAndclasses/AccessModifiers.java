package objectAndclasses;

public class AccessModifiers {
/*  
 *               |          |         SamePACKAGE          |        DifferentPACKAGE
 *   Modifiers   |SameClass | DerivedClass |NonDerivedClass|DerivedClass |NonDerivedClass               
 *               |          |              |               |             |  
 *    public     |  Yes     |      Y       |     Y         |     Y       |     Y
 *    private    |   Y      |      No      |     N         |     N       |     N
 *    protected  |   Y      |      Y       |     Y         |     Y       |     N 
 *    default    |   Y      |      Y       |     Y         |     N       |     N
 *    
 *    We should always define a datatype or variable by private so that it could not be accesible by any other
 *    for eg:
 *           private int age;
 *           private String name;
 *           To get access of these variables in other class we must use getter and setter for age and name
 *           then it would be accessible in other class too.
 *           
 *           Final keyword:
 *          A final class can't be subclassed.
 *          A final method can't be overridden by subclass.
 *          A final variable can only be initialized only once . 
 */
	 public final int number ;
	 
	 AccessModifiers(){
		 number =20;
	 }
}

