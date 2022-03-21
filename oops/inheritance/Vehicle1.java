package inheritance;

public class Vehicle1 {

	//everything can be inherited but not private function or varible.
	private String color;
	int noOfTyres;
	
	public Vehicle1() {
		System.out.println("Vehicles contructor");
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void print() {
		System.out.println("Color="+ color + "  Tyres="+ noOfTyres);
	}
}
