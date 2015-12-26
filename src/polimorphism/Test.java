package polimorphism;

import interfaces.Interface1;
import interfaces.Interface1_1;

import java.io.Serializable;

public class Test extends Object implements Runnable, Serializable, Interface1 {

	// class can extend only 1 class, but can implement any number of interfaces

	@Override
	public int methodInt() {
		return 0;
	}

	@Override
	public Number methodNumber() throws ArrayIndexOutOfBoundsException {
		return null;
	}

	@Override
	public void run() {

	}

}
