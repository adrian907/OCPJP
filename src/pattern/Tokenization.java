package pattern;

import java.util.Iterator;
import java.util.Scanner;

public class Tokenization {

	public void tokenize() {
		String[] tokens = "dowolny tekst do tokenizacji".split("\\s");
		// \\s is a delimiter .
		for (String token : tokens)
			System.out.println(token);
	}

	public void tokenize2() {
		Iterator<String> scanner = new Scanner("dowolny tekst do tokenizacji");
		// Tokenized text is processed here gradually. Alternative for split()

		((Scanner) scanner).useDelimiter("\\s");// stating delimiter .
		while (scanner.hasNext())
			System.out.println(scanner.next());
	}

	// Dividing text to tokens can be made by split() method. Its argument is a
	// statement called separator which will work like space for human eye.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tokenization().tokenize2();
	}

}
