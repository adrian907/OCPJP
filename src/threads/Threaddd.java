package threads;

public class Threaddd {

	public static void main(String[] args) {
		System.out.println("Kod wykonany w w¹tku g³ównym");

		// OPTION #1:
		Thread newThread = new MyThread();

		System.out.println(newThread.getState());

		newThread.setName("Watek 0");// Setting name for thread !
		newThread.start();// We can start one thread just once, and only when
							// he's in state NEW.Every another
							// trial will result in IllegalThreadStateException.

		System.out.println(newThread.getState()); // States differ now !

		System.out.println(newThread.getName() + "\t\t" + newThread.getId()
				+ "\t" + newThread.getPriority());
		// getName- gets name, getId() - gets UNIQUE id .

		Thread newThread2 = new Thread("watek 1 ");
		System.out.println(newThread2.getName() + "\t" + newThread2.getId()
				+ "\t" + newThread2.getPriority());
		System.out.println();
		// dopiero wywo³uj¹c metodê start() tworzymy nowy w¹tek
		newThread2.start();
		// start() creates new thread and launches run().

		// OPTION #2:
		Thread newThread3 = new Thread(new MyRunnable(), "watek 2 ");
		newThread3.start();
		System.out.println(newThread3.getName() + "\t" + newThread3.getId()
				+ "\t" + newThread3.getPriority());

		System.out.println(newThread.getState());
	}
}

// First option of creating a thread is a subclass of Thread.
class MyThread extends Thread { // ta klasa to tylko definicja w¹tku
	// We always must implement run() method.
	public void run() {
		System.out.println("Kod wykonany w nowym w¹tku 1 ");
	}
}

// Second option is implementing Runnable interface. Thread has a 1-argument
// constructor accepting object of class impl. Runnable, so that's the second
// option of creating thread.

class MyRunnable implements Runnable {
	public void run() {
		Thread thread = Thread.currentThread();
		// We use static method to obtain info about current thread .

		System.out.println("W¹tek " + thread.getName() + " w stanie "
				+ thread.getState());

		System.out.println("Kod wykonany w nowym w¹tku 2 ");
	}
}
// TITBIT : Thread is a piece of code runned by JVM independently from the other
// threads. 