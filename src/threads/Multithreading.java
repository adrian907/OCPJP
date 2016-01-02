package threads;

public class Multithreading {

	public static void main(String[] args) {
		Runnable runnable = new MyRunnable2();
		// wszystkie w�tki b�d� wykonywa�y dok�adnie ten sam kod
		Thread threadA = new Thread(runnable);
		Thread threadB = new Thread(runnable);
		Thread threadC = new Thread(runnable);
		Thread threadD = new Thread(runnable);
		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
		// w�tki przeplataj� si� mi�dzy sob�
		// Every time we get different result. Threads start and end , values
		// are written out in panic.
		}
}

class MyRunnable2 implements Runnable {
	private int val = 0;

	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println("id == " + Thread.currentThread().getId()
					+ ", val == " + getVal());
	}

	private synchronized int getVal() {
		return ++val;
	}
}