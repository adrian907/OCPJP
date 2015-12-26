package interfaces;

strictfp class Class1 { // Class widoczna tylko w pakiecie
	// class cannot be private or protected
	// just abstract , final , strictfp or public

	Class1() {

	}

	private class Class1_1 {// inner class can be private or protected.

	}

	protected class Class1_2 {

	}

	private strictfp int method1() {// Name of the method should be a verb +
									// noun, e.g. getData().
		return 1;
	}

	native private int method2(); // native always at the beginning. Method is
									// without body! It's used just for methods.
	// can't be native and strictfp

	public static final synchronized native int method21();
	// longest possible sereies of specifiers.

}

abstract strictfp class Class2 { // "class abstract" will make an error. Order
									// matters!
	// We can't create any instance of this class.
	abstract float method3();

	abstract char mehod4();

	int method4() { // there can be non abstract method in abstract class
		return -1;
	}

	// static abstract int meth1(); Not allowed ! abstract method can be only
	// public or protected, not even static,strictfp etc!
}

abstract strictfp interface Inter { // Interface can be abstract but
// it's not advisable to use this keyword. It can be strictfp as well.

}

public class Test2 implements Interface1 {

	public int methodInt() {// When implementing a method from interface it must
							// be public!
		return 2;
	}

	public Double methodNumber() {
		// Signature doesn't have to be the same as in interface.
		// Types must be just acceptable and exceptions are not obligatory.
		return 2.0;
	}

	Interface1 a = new Test2(); // It's allowed ! We can assign object of class
								// implementing interface to interface's
								// reference .
}
