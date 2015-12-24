package modificators;

/*
 * METHOD AND FIELDS SPECIFICATORS. 
 */

public class VisibilityModificators {

	private int money; // Private fields and methods are not inherited!
	public int family;
	public static int name;
	int notinheritedfield; // It won't be inherited by classes from different
							// packages because of lack of access specificator.

	protected int rescue; // It's visible only in package , but if class from
							// different package extends class containing this field or method it has
							// access to the protected fields as well!

	float nonInheritedMethod() {// The same as with fields above.
		return -1.f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Money extends VisibilityModificators {
	// int x = VisibilityModificators.money; - private field, not allowed!
	// int y1 = VisibilityModificators.family; - when not a static field it's
	// forbidden.
	int y = family; // access to non-private fields allowed!
	static int z = VisibilityModificators.name;
	static int w = name; // Above version also allowed when "name" is static.
}