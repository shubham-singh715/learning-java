package arrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
	
	public static ArrayList<Integer> removeDiplicate(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(arr.get(0));
		for(int i=1;i<arr.size();i++) {
			if(arr.get(i)!=arr.get(i-1)) {
				result.add(arr.get(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList<Integer>();
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(30);
		
		
		System.out.println(removeDiplicate(arr));
		
		

	}

}
