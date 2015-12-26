package polimorphism;

/*
 *WHY IT WORKS LIKE THIS ?  
 * */

class A1 {
	String id = "A";

	void test() {
		System.out.println(id);
	}
}

class B1 extends A1 {
	String id = "B";
}

public class Example3 {
	public static void main(String[] args) {
		A1 var = new A1();
		var.test();
		var = new B1();
		var.test();
	}

}