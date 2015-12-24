package literals;

import com.sun.media.jfxmedia.events.NewFrameEvent;

/*
 * 	ARITHMETIC EXPRESSIONS. 
 */

public class AssigningOperands {

	int A = 12 + 54 * 2 / 23 - 1; // As long as there is no long value it's
									// still integer !
	long B = 12 + 54 * 2 / 23 - 1L; // Long

	byte C = 1;
	// byte b = a+1; - Compilation Error - value of a is not none so we're not
	// sure if it's within the scope of byte.
	byte D = 1 + 1;
	// byte d = 64+64; Compilation error - beyond the scope .

	byte E = (byte) (1 + 1L); // Without casting it's also an error!
	// Examples from above are the same for char and short!
	// char <-32768 ; 32767>

	float F = 2.3f + 43.2f + 2f + 2.f; // Look at type of declaration float
										// number.
	// If all of the expressions are float the value is also float, if just one
	// of them is double, then we have a double expression.

	float G = 2.3f + 43.2f + 2f + 2;

	double H = 2.3f + 43.2f + 2f + 2.; // The last is double .

	float I = 1.1f;

	float J = I + 1.2f; // For byte it wouldn't work !

	byte K = 234 - 123;
	byte L = -64 - 64;

	short M = (short) (32767 + L); // Without casting it won't work.

	char N = 65535; // Char is from 0 to 65535.
	char O = (char) (N - M - L);

	byte P = (byte) 128;// = -128
	byte Q = (byte) 1024;// = 0 .

	public Integer x = 1;

	public static void main(String[] args) {
		new AssigningOperands().x *= 1 + 2; // x = x*(1+2); We always count it from right to left.
		System.out.println("2 plus 2 to : " + 2 + 2); // It will return 2 plus 2
														// to 22. Enumerating
														// from left to right.

		System.out.println(new AssigningOperands().x instanceof Object);
		// instanceof only for references! Not primitives. x can be null!
		// If x's type is not from the same inheriting hierarchy as checked type
		// there will be compilation error.
		// Above we can see use of instance variable with creation of instance in this purpose.
	}

}
// TITBIT : ++ and -- have the highest priority. After them are : * , / and %
// and at the end : + and -.
// TITBIT: Logical operators : &, | , ^ , (now lazy operators) && , || and !.
// TITBIT: Relational operators : < > , <= and >= . Used also for comparing char
// operators. 