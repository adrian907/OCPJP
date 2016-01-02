package threads;

public class Synchronization {

	synchronized void someOp() {
		// synchronizowany kod
	}

	// Above method is equivalent to the someOpp() .

	void someOpp() {
		synchronized (this) {// synchronized block on this object.
			// synchronizowany kod
		}
		System.out.println();
	}

	static synchronized void someOp1() {
		// synchronizowany kod
	}

	static void someOp2() {//object of a class.
		synchronized (Synchronization.class) { // gdy kod pochodzi z klasy
												// Synchronization
			// synchronizowany kod
		}
	}

	public static void main(String[] args) {
		Synchronization mutex = new Synchronization();

		synchronized (mutex) {
			// kod który synchronizujemy na monitorze obiektu mutex
		}
		// at one moment synchronized block can only be launched by one thread,
		// the one which has the monitor of that object. Other threads must
		// wait, they are referred to sleep.
	}

}
// TITBIT : Synchronization is all about pointing at some code to run and object
// whose monitor will be used to give threads access to that code .
