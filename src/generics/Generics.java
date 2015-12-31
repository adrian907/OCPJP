package generics;

import java.util.LinkedList;
import java.util.List;

public class Generics {
	List<Number> list = new LinkedList<Number>();

	// It's a polymorphism, because LinkedList implements List.

	// List<Number> list = new LinkedList<Integer>();
	// Illegal! We could try to add long value and integer value what would
	// cause error, ANYWAY WE OBTAIN COMPILATION ERROR.

	// If above instruction is forbidden, then we can't as well invoke method
	// accepting List<Number> argument for LinkedList<Integer> argument!

	// TYPES OF PARAMETRIZED TYPES MUST REMAIN THE SAME !

	// Tricky way of suming all types of numbers.
	public static Number sumArray(Number[] numsArray) {
		double sum = 0;
		for (Number num : numsArray)
			sum += num.doubleValue();
		return sum;
	}

	// Version of above method for collections. "?" is a wildcard type and means
	// :"every class which".WE needed to circumvent the parametrized type
	// condition.
	// We can't add any element to the collection declared with this type.
	// Obviously Long and Integer conflict etc.

	public Number sumList(List<? extends Number> numsList) {

		// List<? extends Runnable> - the same for interfaces ! also EXTENDS!

		double sum = 0;
		for (Number num : numsList)
			sum += num.doubleValue();
		return sum;
	}

	// List<? super Double> for any supertype of double ; List<Double>,
	// List<Number> or List<Object>. Useful when trying to add elements.
	public void copy(List<? super Double> out, List<? extends Number> in) {
		for (Number num : in)
			out.add(num.doubleValue() * 2);
	}

	public static void main(String[] args) {

		Number[] array = new Integer[4]; // to przypisanie jest poprawne
		// array[0] = new Long(8); // wyj¹tek java.lang.ArrayStoreException
		// With arrays it's slightly different, we have a mechanism which takes
		// care of type of array object and adding element.

		List<Number> list = new LinkedList<Number>();

		// We can add any subtype value, because it's a Number type!
		list.add(12);
		list.add(134L);
		list.add(13f);
	}
}
// TITBIT : List<? extends Object> ===== List<?>.