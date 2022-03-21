package objectoriented;

public class Cube {

	int length;
	int breath;
	int height;
	

	public int VolumeOfCube() {
		
		return (length*breath*height);
		
	}	
		Cube ()     // we are defining the contructor. constructor dosent return any value
		{
			length=10; 	
			breath=30;
			height=20;
		}
		
		Cube (int l, int b , int h)
		{
			length=l; 	
			breath=b;
			height=h;
		}
		Cube (String name)   // whatever is put under contructor reflects same in other class if called using incapsulation
		{
			System.out.println("my name is " + name);
		}
}
