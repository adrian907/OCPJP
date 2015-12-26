package over_load_ride;

class Parent {
}

class Child1 extends Parent {
}

public class Test {
	public static void main(String[] args) {
		Parent obj = new Child1();
		test(obj);
	}

	static void test(Parent p) {
		System.out.println("method for Parent");
	}

	static void test(Child1 c) {
		System.out.println("method for Child");
	}
}
/*
 * to, która z przeci¹¿onych metod zostanie wywo³ana jest okreœlane w czasie
 * kompilacji, kiedy to nie wiadomo jeszcze, jaki bêdzie rzeczywisty obiekt, a
 * wiêc o wywo³ywanej metodzie decyduje typ referencji nie zaœ typ obiektu ale
 * dziala to tylko dla metod static !
 */