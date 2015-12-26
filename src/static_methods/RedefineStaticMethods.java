package static_methods;

/*
 * EXAMPLE USING OBJECT FOR STATIC METHOD.
 */

class SomeClass { 
	static void printMessage() {
		System.out.println("my message");
	}
}

public class RedefineStaticMethods {
	public static void main(String[] args) {
		SomeClass obj = null;	// there's no NullPointerException!
		obj.printMessage();	// Operating on object with static method ! 
		// Name of a reference class is placed instead of reference while compilation.
	}

}
