package exceptions;

import java.io.IOException;

public class Exc1 {

	/*
	 * CHECKED EXCEPTIONS - we must catch them (try/catch block) or declare them
	 * in method signature.
	 */

	class SomeClass {
		void someOp() {
			throw new NullPointerException(); // Unchecked , so we don't have to
												// catch it or declare it.
		}

		void someOtherOp() throws IOException {
			throw new IOException(); // Checked so we declare it by throws
										// keyword.
		}

		void nextOp() {
			try {
				throw new IOException();// Checked as well but we don't declare
										// it, because we used (try/catch).
			} catch (IOException ioExc) {
				ioExc.printStackTrace();
			}
		}

		// We can declare even unchecked exception, this is not a compilation
		// error.
		void anotherOp() throws NullPointerException {
			try {
				System.out.println("Bla");
			} catch (NullPointerException ec) { // We can also serve them.
				System.out.println("Hi");
			}
		}
	}

}
// TITBIT : Every exception is an object. Every exception class inherits from
// Throwable interface.
// TITBIT : Unchecked Exceptions are those from Error class and RutimeException
// and their subclasses.
// TITBIT : Checked are from Throwable and Exception class as well as
// subclasses, without those above.
