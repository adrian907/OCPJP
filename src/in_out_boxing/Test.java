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
		Integer a = 1024;
		Integer b = 1024;
		if (a != b)
			System.out.println("a i b to ró¿ne obiekty");
		Integer c = 16;
		Integer d = 16;
		if (c == d)
			System.out.println("c i d to ten sam obiekt");
	}

	// If inboxed values are of type : byte, short, char, int or boolean
	// within range <-128,127> ( char from \u0000 to \u007f) then, the same
	// instance of objet is used for them.
}
