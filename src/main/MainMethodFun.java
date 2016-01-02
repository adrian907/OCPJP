package main;

public class MainMethodFun {

	public static void main(String a) {
		// There can be more than one main function, but it needs to have an
		// array
		// of strings as a parameter. Try to execute the program now and nothing
		// will show.
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// If the parameter woud be different we would receive runtime
		// error,as well as when deleting public or static specifiers.
	}

}
// TITBIT : In a java class, we can have multiple main methods but signature of
// this main method is unique. It should be public(because main method can be
// called from any where), static( because main method is executed before
// creating any instance so , it should be class method), void (it does not
// return any value to OS as contrast to C program) and main method should have
// capability of accepting arguments of type String array(Command line arguments
// are stored in this array).