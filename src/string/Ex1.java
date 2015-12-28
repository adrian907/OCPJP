package string;

public class Ex1 {

	public static void main(String[] args) {
		String a = new String("Ola ma kota"); // Always making a new String
												// object.
		String b = "A Ula psa"; // Making a new String object only if the token
								// didn't exist before.

		// System.out.print(b.getClass());

		String a2 = "Ola";
		String b2 = "Ola";

		System.out.println("a2 == b2 : " + (a2 == b2)); // True.

		System.out.println("Porownanie leksykograficzne : "
				+ a2.equalsIgnoreCase(b2));
		// Allows comparing texts - do tehy consist of the same characters or
		// not. Returns boolean value . 
		
		String c = new String("Ola");
		String d = new String("Ola");

		System.out.println("c == d : " + (c == d));// False.

		String a1 = "Ola";
		String b1 = a1;
		System.out.println("a1 == b1 : " + (a1 == b1));
		a1 += " ma kota";// Strigs are immutable .
		System.out.println("a1 == b1 : " + (a1 == b1));
		
		String str = "  Hahahaha  ";
		System.out.println(str.replace('h', 'X'));	
		
		System.out.println(str.length());
		str = str.trim();			// Returns new string without white spaces.
		System.out.println(str.length());
	}

}
