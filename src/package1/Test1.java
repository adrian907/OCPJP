package package1;

import static java.lang.Math.*; // import statyczny
//bez slowa static blad kompilacji .

public strictfp class Test1 {

	String[] names[];	// Correct but not advisable .
	
	char Char;	// default value for char is \u0000.
	
	boolean Boole; 	// false for default. 
	
	private transient volatile int a = 5;
	// instance variable.They are initialized for default values
	// when an instance is created . Transient is for not including in
	// serialization.

	protected static transient volatile int b = 3;

	// class variable. Initialized with default value when class is started.

	class InnerClass { // Has access to all of the data of a superclass.
		// We have a separate class but we are still allowed to work on private
		// fields of a superclass.
		// We reach higher level of abstraction thanks to them .

	}

	int method1() {
		final int a = 2; // local variable. Can be only final. Must be
							// initialized by a programmer.
		int k = this.a; // using the instance variable, not a local one.
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = PI;
		System.out.println(Enum.values());
	}

}
