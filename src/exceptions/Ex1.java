package exceptions;

public class Ex1 {
	public void someOp() {
		try {
			System.out.println("przed wywo³aniem throwingOp()");
			throwingOp();
			System.out.println("po wywo³aniu throwingOp()");
		} catch (Exception exc) {
			System.out.println("w bloku catch");
		} finally {
			System.out.println("w bloku finally");
		}
		System.out.println("za blokiem try-catch");
	}

	public void throwingOp() throws Exception {// throw new Exception();

		// Because we don't have this instruction, there's no exception at all,
		// catch block is visited.
	}

	public static void main(String[] args) {
		new Ex1().someOp();

	}
}
// ArrayIndexOutOfBoundsException – Thrown when attempting to access an array
// with an invalid index value (either negative or beyond the length of the
// array).

// ClassCastException – Thrown when attempting to cast a reference variable to a
// type that fails the IS-A test.

// IllegalArgumentException – Thrown when a method receives an argument
// formatted differently than the method expects.

// IllegalStateException – Thrown when the state of the environment doesn’t
// match the operation being attempted, e.g., using a Scanner that’s been
// closed.

// NullPointerException – Thrown when attempting to access an object with a
// reference variable whose current value is null.

// NumberFormatException – Thrown when a method that converts a String to a
// number receives a String that it cannot convert.

// AssertionError – Thrown when a statement’s boolean test returns false.

// ExceptionInInitializerError – Thrown when attempting to initialize a static
// variable or an initialization block.

// StackOverflowError – Typically thrown when a method recurses too deeply.
// (Each invocation is added to the stack.)

// NoClassDefFoundError – Thrown when the JVM can’t find a class it needs,
// because of a command-line error, a classpath issue, or a missing .class file.