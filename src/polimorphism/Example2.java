package polimorphism;

class A {
	void test() {
		System.out.println("A");
	}
}

class B extends A {
	void test() {
		System.out.println("B");
	}
}

public class Example2 {
	public static void main(String[] args) {
		A var = new A();
		var.test();

		var = new B(); // Polimorphism is a mechanism which choses a method to
						// execute not basing on reference type but on actual
						// object's type .
		var.test();
	}
}
// TITBIT: Polimorphism is connected only with methods, ONLY with instance
// methods.

