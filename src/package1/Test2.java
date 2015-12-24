package package1;

/*
 * LOCAL VARIABLES SCOPE.
 * */

public class Test2 {
	public static void main(String[] args) {
		int x = 2;
		triple(x);
		// We run a method for a local variable! It's located on a stack so it's
		// value is rapidly forgotten and doesn't last long, if x is not
		// instance or class field then it can't change value this way.
		System.out.println("x: " + x);
	}

	static void triple(int x) {
		x *= 3;
	}
}