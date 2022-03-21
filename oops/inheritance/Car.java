package inheritance;

public class Car extends Vehicle1{
	//Car being a child class copies or gets variables and functions of Vehicle1 being a parent class.
     
	int noOfDoors;
	
	//This is function overriding as vehicle and car has same function print but print of car will be given
	/// preference .
	public void print() {
		super.print();
		//Super keyword gets property or function of super or parent class.
		System.out.println("Color="+ getColor() + "  Tyres="+ noOfTyres + " Doors="+noOfDoors);
	}
}
