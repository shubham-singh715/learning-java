package useofOOPS;

public class U5_DynamicArray {

	private int data[];
	private int nextElementIndex;
	
	public U5_DynamicArray() {
	       data= new int[5];
	       nextElementIndex=0;
	}
	public int length() {
		return data.length;
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
	return nextElementIndex ==0;
}
	
	public int get(int i) {
		if(i>=nextElementIndex) {
			//Throws error
			return -1;
		}
		return data[i];
	}
	
	public void add(int num) {
		if(nextElementIndex==data.length) {
			doubleCapacity();
		}
		data[nextElementIndex]=num;
		nextElementIndex++;
	}

	private void doubleCapacity() {
      int temp[]=data;
      data =new int[2*temp.length];
      for(int i=0;i<temp.length;i++) {
    	  data[i]=temp[i];
      }
		
	}

	public int set(int i, int j) {
		if(i>=nextElementIndex) {
			// Throws exception
			return -1;
		}
		return data[i]=j;
		
	}

	
}