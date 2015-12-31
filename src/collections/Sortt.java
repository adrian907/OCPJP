package collections;

import java.util.Arrays;
import java.util.Comparator;

public class Sortt {

	// Comparator<T> is an interface which allows us to compare objects.

	// Above interface is implemented by Integer, Double, Character ,Calendar,
	// Date, Time or String and has just one mehod: compareTo(T obj).

	// Comparator<T> is an interface, which allows to make a comparator class,
	// where we can define our own comparator, it has just one method : int
	// compare(T,T).

	public static void main(String[] args) {
		String[] strings = { "Urszula", "Ola", "Agata", "Jola" };
		Arrays.sort(strings, new LengthComparator());
		for (String s : strings)
			System.out.print(s + " ");
	}
}

// okreœla sortowanie stringów od najkrótszego do najd³u¿szego
class LengthComparator implements Comparator<String> {
	// LengthComparator is a comparator!
	public int compare(String strA, String strB) {
		return strA.length() - strB.length();
	}
}

// TITBIT: We can use BinarySearch() only for SORTED arrays and lists, it's a
// way faster than normal,.
// TITBIT : Arrays and Collections are classes sharing methods for working
// arrays and coll.