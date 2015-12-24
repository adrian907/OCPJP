package anonymous_inner_classes;

public class OuterClass3 {
	public static void main(String[] args) {
		// wywo³ujemy metodê definiuj¹c jednoczeœnie klasê anonimow¹
		runThread(new Runnable() {
			public void run() {
				System.out.println("Instancja klasy anonimowej");
			}
		}); // œrednik dopiero za instrukcj¹ wywo³ania metody
	}

	public static void runThread(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.start();
	}
}