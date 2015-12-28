package conditional_statements;

import java.util.LinkedList;
import java.util.List;

public class For_Each {

	public static void main(String[] args) {
		List<Integer> someList = new LinkedList<Integer>();

		someList.add(1);
		someList.add(2);
		someList.add(3);

		// Autoboxing is working too.
		for (int i : someList) {
			// Type of variable used for going through the collection/array must
			// be a subtype,supertype or exactly the same type as
			// collection/array.
			System.out.print(i + " ");
			
			
		
		}
	}

}
