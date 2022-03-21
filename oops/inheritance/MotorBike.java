package inheritance;

public class MotorBike extends Vehicle1 {

	public MotorBike() {
		/*
		 * Child class copies the constructor of parent class first i.e vehicle() then works on its own 
		 * constructor. But if the constructor of parent class has some parameter i.e vehicle(int speed).
		 * Then Child class will throw error as it was accepting empty constructor.
		 * So to tackle this error we nedd to put super(value of speed , eg 100).   
		 */
		System.out.println("MotorBike contructor");
	}
}
