package collections;
/*
 * HASHCODE() AND EQUALS() .
 * 
 * */
public class HashcodeEquals {
	private int someValue;

	public int hashCode() {
		return someValue;
	}

	// HashCode() must be overriden whenever we override equals.
	
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (someValue != ((HashcodeEquals) obj).someValue)
			return false;
		return true;
	}

	public static void main(String[] args) {

	}
}
// Equals musi byc zawsze zwrotna, symetryczna i przechodnia a do tego dzialac
// tylko na obiektach niezadeklaorwanych jako null i zawsze zwracac true lub
// false.
// Using y with a null reference will throw NullPointerException in this case :
// y.equals(x) when x is instantiated, but x.equals(y) returns just false.
// TITBIT : It must return the same values for every invokation of this method
// for the same objects. If x.equals(y) = true ==> x.hashcode(y) must be true as
// well. But if they are different objects they can have the same hashcode
// values.
// hashCode() - wartosc skrotu. 