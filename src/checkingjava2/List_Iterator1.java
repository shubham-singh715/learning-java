package checkingjava2;
import java.util.*;
public class List_Iterator1 {
	/* public boolean hasNext();
	 * public Object next();
	 * public boolean hasPrevious();
	 * public Object previous();
	 */

	public static void main(String[] args) {
                
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ross");
		names.add("Monica");
		names.add("Rachael");
		names.add("Phoebe");
		names.add("Chander");
		
		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext())
		System.out.println(itr.next());
			
		

	}

}
