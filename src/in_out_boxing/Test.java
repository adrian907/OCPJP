package in_out_boxing;

public class Test {

	private Integer counter;

	public void noAutoBoxing() {
		if (counter == null)
			counter = new Integer(0);
		counter = new Integer(counter.intValue() + 1);
	}

	public void useAutoBoxing() {
		if (counter == null)
			counter = 0; // in-boxing
		counter++; // out-boxing, inkrementacja, in-boxing
	}

	public static void main(String[] args) {
		// odpowiada instrukcji ‘Integer a = new Integer(1024);’
		Integer a = 1024;	//Wrappr classes are immutable!
		Integer b = 1024;
		if (a != b)
			System.out.println("a i b to ró¿ne obiekty");
		Integer c = 16;
		Integer d = 16;
		if (c == d)
			System.out.println("c i d to ten sam obiekt");

		Boolean boole = new Boolean("1");
		// If we don't invoke constructor with "true", but with some other word,
		// object will always have false value.( case sensitivity is not
		// important for true).
		
		
		System.out.println(Integer.valueOf("10", 2));	//Returns object in this radix ! 
		
		//xxxValue - taking value from a wrapper class, e.g,. intValue(); Instance methods!
		//parseXXX - conversion from String to primitive value. Static methods!
		Integer int1 =- 23;
		int int2 = int1.intValue();	
		
		System.out.println(Integer.parseInt("101",2));// Returns primitive value in this radix. 
		
		System.out.println(Integer.toBinaryString(int1));
		System.out.println(Integer.toHexString(int1));
		System.out.println(Integer.toOctalString(int1));
		System.out.println(Integer.toUnsignedLong(int1));
		System.out.println(Integer.toUnsignedString(int1));
		
	}

	// If inboxed values are of type : byte, short, char, int or boolean
	// within range <-128,127> ( char from \u0000 to \u007f) then, the same
	// instance of objet is used for them.
}
// In & out-boxing is used since Java 5. Useful, when we want to transfer
// primitive value to method accepting only objects.
// java.lang.Integer - java.lang!
// TITBIT : Every wrapping class has a constructor with String parameter, except
// Character.