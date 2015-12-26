package literals;

public class Literals {
	/*
	 * Number-complete literals
	 */
	int A = 0x2; // hexadecimal.
	int B = 0X313abcdf; // correct too.
	int C = 0X3AbDe; // Case of letter is not important.
	int D = 0X000003;// Finite amount of zeros can precede exact number and
						// follow "0X" .
	long E = 0xA32L; // By adding L at the end we say it's a long number. By
						// default literals are int

	int F = 0123; // octadecimal literal.
	static int G = 00000032; // Finite amount of zeros can precede the octadecimal
						// number. In hexadecimal it's forbidden.

	/*
	 * Floating-point literals
	 */
	// By default they are of double type.
	double H = 0D;
	double I = 1.F;
	double J = 123.;
	double K = .3450;
	double L = 23e1f;
	double M = 1e1;
	double N = 3.0E-1F; // Exponent can be E or e.
	// When talking about decimal literals we need :
	// -complete part OR decimal part;
	// -one of : dot OR symbol and value of exponent OR 
	//letter of a type (f, F or D,d);

	double O = 0x3p1;// hexadecimal floating point number.
	double P = 0x2.3p0f;
	double Q = 0X.1p4d;

	// For hexadecimal floating point literals we need :
	// - exponent and its value. (p or P for exponent)
	// - complete part or decimal part of number.
	// The rest is optional.

	/*
	 * Logical literals.
	 */
	boolean boole1 = true;
	boolean boole2 = false; // only 2 possibilities for these literals.

	/*
	 * Character literals;
	 */
	
	char R='\u1234';
	char S = '\n';
	char T = '\uffff';	// We are using UTF-16 for encoding.
	char U = '\uFFFF';	// it's the same value as above. 
	
	/*
	 * Text literals 
	 */
	
	String W = "asdasdasdasd";// Any text between "" . 
	
	public static void main(String[] args) {
		System.out.println(G);
	}

}
//TITBIT: Literals can't be byte or short!