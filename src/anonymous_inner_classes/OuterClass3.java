package anonymous_inner_classes;

public class OuterClass3 {
	public static void main(String[] args) {
		// wywo�ujemy metod� definiuj�c jednocze�nie klas� anonimow�
		runThread(new Runnable() {
			public void run() {
				System.out.println("Instancja klasy anonimowej");
			}
		}); // �rednik dopiero za instrukcj� wywo�ania metody
	}

	public static void runThread(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.start();
	}
}