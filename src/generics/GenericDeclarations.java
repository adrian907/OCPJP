package generics;

import java.util.LinkedList;
import java.util.List;

public class GenericDeclarations {

	// method uses generic class
	public void doublee() {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);

		ListProcessor<Integer> doubleProcessor = new ListProcessor<Integer>() {
			protected Integer doProcess(Integer t) {
				return t * 2; // klasa anonimowa rozszerzaj¹ca typ
								// ListProcessor<T>
			} //We just instantiated our class and implmeneted doProcess().
		};
		List<Integer> newList = doubleProcessor.process(list);
		// Above we obtain a new list, which values are doubled.
	}

	public static void main(String[] args) {
	}

}

// Generic class and generic method. Generics is not only for collections .
abstract class ListProcessor<T> {
	public List<T> process(List<T> listOfT) {
		List<T> newList = new LinkedList<T>();
		for (T t : listOfT)
			newList.add(doProcess(t));
		return newList;
	}

	protected abstract T doProcess(T t);
	// Thanks to this declaration we can implement method depending on the role
	// of the class.
}