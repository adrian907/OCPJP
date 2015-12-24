package anonymous_inner_classes;

public class OuterClass {
	public static void main(String[] args) {
		// tworzymy instancjê klasy anonimowej implementuj¹cej Runnable
		Runnable myRunnable = new Runnable() {	
			//because of the fact it's anonymous class we don't even write implements!

			int uselessMethod() { // This method can't be invoked. We should only
									// override or implement methods in
									// anonymous classes.
				return -1;
			}

			public void run() {
				System.out.println("Instancja klasy anonimowej");
			}
		}; // pamiêtajmy o œredniku po definicji klasy anonimowej
		runThread(myRunnable);
	}

	public static void runThread(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.start();
	}
}

// TITBIT: Type of inner classes but without name , used when creating an
// instance of this class. (mainly just one)
// We define it when implementing some interface or improving power of superclass
// useful when we need just one instance of a class.