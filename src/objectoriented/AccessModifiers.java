package objectoriented;

public class AccessModifiers {
/*    Modifiers           Class           Package        subclass         World               
 *     
 *    public                Yes             Y              Y               Y
 *    private               Y               No             N               N
 *    protected             Y               Y              Y               N
 *    no modifier           Y               Y              N               N
 *    
 *    We should always define a datatype or variable by private so that it could not be accesible by any other
 *    for eg:
 *           private int age;
 *           private String name;
 *           To get access of these variables in other class we must use getter and setter for age and name
 *           then it would be accessible in other class too.
 *           
 *           Final keyword:
 *          A final class cant be subclassed.
 *          A final method cant be overridden by subclass.
 *          A final variable can only be iinitialized only once . 
 *          A final variable cant be changed.
 */
	 final int number ;
	 
	 AccessModifiers(){
		 number =20;
		 //mow no one can change value of number from 20.
	 }
}

