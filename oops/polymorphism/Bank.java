package polymorphism;

 abstract public class Bank {
	
      int getIntrestRate() {
		  return 0;
		  
		   /*
		    * Polymorphism is the ability of an object to take different forms,
		    *  i.e., a single action that can be performed in different ways. 
		    *  So, polymorphism means many forms.
		    */
		  
		  /* An abstract class cannot make objects on its own but if we inherit it in other class using
		  polymorphism the we can create object as shown here. 
		  If we want to make an abstract method then there are two conditions :
		  1)  Class should be abstract.
		  2)  It should not be defined i.e return should not be mentioned.
		  * And in any class where abstract class is inherited should define the abstrac method using return.
		  */
}
}