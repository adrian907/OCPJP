package interfaces;

public abstract strictfp interface Interface1 {
	// Interface must be defined in its own file. Name should be
	// an adjective. Can implement as many interfaces as needed.

	public interface Interface2 { // Nested classes and interfaces are public
									// and STATIC by
									// default.

		interface Interface3 {

		}
	}

	interface Interface {

	}

	abstract class Interface_Class {
	}

	static public class C {// Nested classes and interfaces are public and
							// STATIC by default. We
		// can use public keyword.
		// class C{} Can't override class this way!
	}

	public int methodInt(); // methods shouldn't have specificators.
							// It'll compile but it's not advisable.

	Number methodNumber() throws ArrayIndexOutOfBoundsException;

	int Aasdasfsdfjsdfjshdofihhjasdfbksdfhksldfjqwdjjfd = 34;

	// Variables are static final and public in interfaces. Name can be as long
	// as you want.
	// int -aasd =23; & double 812name="Ania"; === forbidden syntax.
	public enum E {
	};
}
