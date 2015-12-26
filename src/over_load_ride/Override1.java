package over_load_ride;

import java.io.IOException;
import java.sql.SQLException;

public class Override1 {
	void test(String str) throws Exception {
	}

	static void OverrideMe() {// Can't override static method !
	}

}

class Child extends Override1 {
	void test(String string) throws IOException, SQLException {
		// both are subtypes of Exception exception. If we would use Object
		// instead of String, then it would be just an overloading
		try { // Had to use try catch block because of
				// unhandled Exception exception
			super.test("H"); // Calling overridden method.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void OverrideMe() {// It's a new method. We didn't override it! We
								// can't use super too.

	}
}

// TITBIT : Overriding method must be compatible in terms of : list of
// arguments,access modifiers,
// declared exceptions and returned type.
// #1 - specificator can be the same or less restricting.
// #2 - argument's types must be the same,
// #3 - returned type must be the same or a subtype of this type.
// #4 - exceptions - overriding method can't declare new CHECKED
// exceptions(trial will result in compilation error),
// it can declare smaller amount of them or exceptions which are subtypes of
// those declared in overridden method.
// What's more this method can declare as many unchecked exc's as you wish.
