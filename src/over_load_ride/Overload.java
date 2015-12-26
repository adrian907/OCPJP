package over_load_ride;

public class Overload {

	int method(int k) {
		return -1;
	}

	float method(float f) {
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Overload().method((byte) 1.f));
		System.out.println(new Overload().method(1.f));
		System.out.println(new Overload().method('a'));
	}
	// When we don't have method which arguments are the same as in its
	// invocation ,
	// then compiler is looking for the smallest bigger type starting from :
	// byte,short,int,long,float,double. char is treated as int.
}

// TITBIT : There are no restrctions about returned type, declared exceptions or
// access specifiers.
