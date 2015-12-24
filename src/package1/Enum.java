package package1;

import package2.Interface1;

public enum Enum implements Interface1.Interface2.Interface3 {// We can't define
																// enumeration
	// only in methods! They can
	// implement interfaces.
	// enumeration constants always on top !
	SMALL(1) {
		@Override
		int Experiment() { // if there is an abstract method in enumeration type
							// it must be defined by each and every constant.
			return 0;
		}
	},
	BIG(2) {
		@Override
		int Experiment() {
			return 0;
		}
	},
	HUGE(3) {
		@Override
		int Experiment() {
			return 0;
		}
	}; // Any class as well as enumeration can't be
		// static when being public.(Just strictfp)
		// Semicolon is obligatory if we want to add
		// something to enumeration type like methods
		// etc.

	abstract int Experiment();

	private int size; // enumeration type variable

	final static public int E = 3; // constant

	Enum(int size) { // constructor. Constructors are always private ! There is
						// no other way of creating enumeration type than just
						// declaring it.
		this.size = size;
	}

	public int getSize() { // method
		return size;
	}

	class Hello { // nested class
	}

	enum Enum2 { // nested enumeration
	}

	interface Hi { // nested interface
	}
}
// TITBIT : In enumeration type we can create variables, constants ,
// constructors , methods , subclasses , another enumerations
// TITBIT : Enumeration types can't inherit from other enumerations, only from
// Enum<E> which gives methods E[] values and E valueOf(String name).
// We can use == operator for enums because of their unique. 
