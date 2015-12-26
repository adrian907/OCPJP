package polimorphism;

/*
 *WHY IT WORKS LIKE THIS ?  
 * */

class A3 {
	void test() {
		System.out.println(getId());
	}

	String getId() {
		return "A";
	}
}

class B3 extends A3 {
	String getId() {
		return "B";
	}
}

// It works because here we are using method connected with object ? That's why
// we have "this" ?
public class Example4 {
	public static void main(String[] args) {
		A3 var = new A3();
		var.test();
		var = new B3();
		var.test();
	}
}
