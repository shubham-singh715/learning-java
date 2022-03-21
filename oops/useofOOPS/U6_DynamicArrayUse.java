package useofOOPS;

public class U6_DynamicArrayUse {

	public static void main(String[] args) {
		
		U5_DynamicArray d =new U5_DynamicArray();
		
		for(int i=0; i<10;i++) {
			d.add(20+i);
		
		}
		System.out.println(d.length());
		System.out.println(d.size());
		
		System.out.println(d.isEmpty());
		
		for(int i=0;i<d.size();i++) {
			System.out.print(d.get(i)+ "  ");
		}
		
		System.out.println(d.set(3, 10000));
		
		
	}

}
