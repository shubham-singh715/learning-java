package inheritance;

public class VehicleUse2 {

	public static void main(String[] args) {
             Car creta= new Car();
             creta.setColor("white");
             creta.noOfTyres=4;
             creta.noOfDoors=4;
             creta.print();
             
             MotorBike kawasaki =new MotorBike();
             kawasaki.setColor("Green");
             kawasaki.noOfTyres=2;
             kawasaki.print();
             
             Vehicle1 v= new Car();//This is polymorphism.
	}

}
