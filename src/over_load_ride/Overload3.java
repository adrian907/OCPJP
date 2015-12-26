package over_load_ride;

public class Overload3 {
	public static void main(String[] args) {
		Overload3 test = new Overload3();
		test.someOp(1L);
	}

	void someOp(long... x) {
		System.out.println("someOp(long... x)");
	}

	void someOp(Long x) {
		System.out.println("someOp(Long x)");
	}
	// Inboxing always has higher priority than var-args when overloading a
	// method.
}
