package objectAndclasses;

public class O4_Contructor {

	/*
	 *  If we use default constructor i.e Student() with no argument then we will have to specify values
	 *  for its properties by using s1.name or s1.email etc but if we specify the arguments of 
	 *  constructor as properties i.e Student(String name, String email) as done below. Then 
	 *   we just have to specify there values just while making objext instead of s1.name.
	 */
	String fatherName;
	int phoneNum;

	public O4_Contructor(String fatherName,int phoneNum) {
		this.fatherName=fatherName;
		this.phoneNum=phoneNum;
	}
	
	public void print() {
		System.out.println(fatherName+ " "+phoneNum);
		
	}
}

