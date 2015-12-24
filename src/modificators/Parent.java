package modificators;

/*
 * EXAMPLE OF PROTECTED ACCESS.
 * */

public class Parent {
	protected int x = 5;
}

class Child extends Parent {
	int parentInstanceAccess() {
		Parent parent = new Parent();
		
		// dzia�a tylko je�li klasy s� w tym samym pakiecie
		return parent.x;
	}

	int thisInstanceAccess() {
		Child child = new Child();
		// to zawsze jest ok
		return child.x;
	}

	int inheritanceAccess() {
		// zawsze ok
		return x;
	}
}