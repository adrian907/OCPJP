package conditional_statements;
/*
 * 
 */

public class For {

	public static void main(String[] args) {

		// for(A ; B ; C )
		// A - section for initialization, always executed just once, can be
		// empty, can be any instruction.
		// B - section for boolean condition, if there isn't any statement, loop
		// is everlasting.
		// C - section for incrementation, here as in A we can put any
		// instruction, can be empty as well.

		int x = 1, y = x;
		for (System.out.println("sekcja 1."); x == y; System.out.println("sekcja 3.")) {
			System.out.println("cia³o pêtli");
		}//Why "sekcja 1." doesn't show even once !?!

		// for (;;) {} // empty loop, allowed.

	}

}
