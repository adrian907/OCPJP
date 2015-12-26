package over_load_ride;

public class Overload2 {
	public static void main(String[] args) {
		Overload2 test = new Overload2();
		int i = 1;
		test.someOp(i);
	}

	void someOp(double x) {
		System.out.println("someOp(double x)");
	}

	// Primitive always has higher priority than inboxing when overloading a
	// method.

	void someOp(Integer x) {
		System.out.println("someOp(Integer x)");
	}
}