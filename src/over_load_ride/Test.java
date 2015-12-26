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
 * to, kt�ra z przeci��onych metod zostanie wywo�ana jest okre�lane w czasie
 * kompilacji, kiedy to nie wiadomo jeszcze, jaki b�dzie rzeczywisty obiekt, a
 * wi�c o wywo�ywanej metodzie decyduje typ referencji nie za� typ obiektu ale
 * dziala to tylko dla metod static !
 */