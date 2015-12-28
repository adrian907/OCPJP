package exceptions;

public class Exc2 {

	int Operation() {
		try {
			System.out.println("If we don't have catch, we must have finally!");
			return 1;
			// Finally will execute always , even in this situation !
		} finally {
			System.out
					.println("But if we don't have finally we must have at least oe catch statement");
		}
	}

	void Operation2() {
		try {
			System.out.println("Example without finally");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("At least one catch statmenet is obligatory");
		} catch (Exception e2) {
			System.out.println("If we would switch place of catch statements"
					+ " there would occur compilation error.");
		}
	}

	public static void main(String[] args) {
		new Exc2().Operation();
	}

}

// NumberFormatException - e.g. when we want to create an object with
// notaccpetable String parameter : new Integer("jeden");
//
