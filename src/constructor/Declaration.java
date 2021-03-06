package constructor;


public class Declaration {

	int a;
	int b;

	int Declaration() { // method can have the same name as class ( and
						// obviously constructor ).
		return -1;
	}

	Declaration(int a) { // can be also public , protected and private.
	}

	Declaration() { // Default constructor generated by compiler has the same
					// access modifier as class and icludes onlysuper()
					// instruction.
	}

	// Constructor can only be invoked by super(...) or this(...) - no other
	// option!

	public static void main(String[] args) {

	}

}

class Extend extends Declaration {
	
	String name;
	int age ;
	
	
	Extend(int a, int b) {
		this("Hi", 3);// "this(...)" when invoking constructor from the same class.
	}

	Extend(String str, int e) {
		super(); // When invoking a constructor from superclass.
		this.name=str;
		this.age=e;
	}
	
	
	public static void main(String[] args){
		System.out.println(new Extend(2,31).age + new Extend("Hello", 12).name);
	}
}
// TITBIT : Default constructor is made while there's no other explicitly
// declared one. It's only work is to call constructor from the superclass
// (super() ).
// TITBIT : Abstract class has constructor , interface does not.
// TITBIT : The first instruction in constructor is either super(...) or
// this(...). When none of them exists explicitly , compiler adds super() at the
// beginning of constructor body .
