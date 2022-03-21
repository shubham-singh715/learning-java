package objectAndclasses;

public class O5_Static {
   
	String nameofStudent;
	int rollNum;
	private static int numOfstudents;
	 /* Suppose if we want to keep record of how many students have enrolled in our institute.
    So to keep the record we can increase numOfstudent by 1 every time we create a student.
    But if we just write int numOfstudent then it will be property of object. And each time we create a 
    student , a numOfstudent will also be created and it can be accessed by writing s1.numOfstudent.
    And every time s1.student or s2 or any student is called , the value will be returned 1 only. 
    * So,we will use "static".
    * Static is a keyword which indicates that a certain variable belongs to the class and not the object.
    * So , each time a student object is created , the count of numOfstudent will be increased as every object
      will have access to the variable . 
    * And static variable will be called by className.variableName i.e O5_Static.numofstudent */
  
	public O5_Static(String nameofStudent) {
      this.nameofStudent=nameofStudent;
      numOfstudents++;
      this.rollNum=numOfstudents;
	}
	
	// Anyone can change the noOfstudents if its is not private.So we made it private.
	// But we want that anyone can see it an can't change it. So we made a getter function which should be static
	// as well because a static variable is used.
	public static int getnumOfstudent() {
		return numOfstudents;
	}
	// this keyword can't be used inside a static function bcoz this specifies an object and static is of class.
}
