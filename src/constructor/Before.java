package constructor;

/*
 * CAN'T USE NONSTATIC FIELDS BEFORE SUPER() IS EXECUTED - EXAMPLE.
 * */

public class Before extends Parent {
	Before() {
		super(doSomethingBefore()); //
	}

	// Until super() is not done ( not just invoked- done!) thre can't be any
	// use of nonstatic field or method.
	static String doSomethingBefore() {
		System.out.println("before call to super()");
		return "some text";
	}

	public static void main(String[] args) {

		Before a = new Before();
	}
}

class Parent {
	Parent(String a) {
		System.out.println(a);
	}

}