package objectoriented;

public class car {

	public static void main(String[] args) {
		
		hyundai santro = new hyundai();        // Santro is object of hyundai class
		
		santro.setName("Santro");
	    santro.setPrice(300000);
	    santro.setMileage(18);
	    santro.setSeatCapacity(5);
	    
        hyundai verna = new hyundai();        // verna is object of hyundai class
		
        verna.setName("Verna");
        verna.setPrice(1000000);
        verna.setMileage(25);
        verna.setSeatCapacity(5);
        
        hyundai creta = new hyundai();        // creta is object of hyundai class
		
        creta.setName("Creta");
        creta.setPrice(1500000);
        creta.setMileage(22);
        creta.setSeatCapacity(5);
        
		System.out.println(" Name= "+ santro.getName() + " Price= " + santro.getPrice()+ " Mileage= "+ santro.getMileage());
		System.out.println(" Name= "+ verna.getName() + " Price= " + verna.getPrice()+ " Mileage= "+ verna.getMileage());
		System.out.println(" Name= "+ creta.getName() + " Price= " + creta.getPrice()+ " Mileage= "+ creta.getMileage());
	}

}
