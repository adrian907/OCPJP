package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsFun {

	public void Kolejka() {
		Queue<Integer> kol = new PriorityQueue<>();

		System.out.println(kol.isEmpty());
		kol.add(12);
		kol.add(3);
		kol.add(93);

		System.out.println(kol.size() + " " + kol.contains(13));
		System.out.println(kol);

		kol.remove(); // it's a queue ! boolean remove (Object O) is optional in
						// Collection interface(?)

		kol.peek();// Quick look at first element in this collection.
		kol.offer(32); // add() but for queues.
		kol.poll();// Returns first element and deletes him.
		
		System.out.println(kol);
		
		//LinkedList<E> is a FIFO type of queue, implements List<E> and Queue<E>.
	}

	void Iterat() {
		List<String> list = Arrays.asList("Ola", "Ala", "Ula");

		Iterator<String> iterator = list.iterator();
		// Iterator allows us to go through elements of list easily.
		// Be careful because when using iterator on collections with no
		// specified order , iterator may return its elements in different
		// order depending on time.

		while (iterator.hasNext())
			// be careful here.
			System.out.println(iterator.next());
		// next() for another element from iterator.
		Object[] tab = list.toArray();
		// from list to array.
	}

	public static void main(String[] args) {
		new CollectionsFun().Kolejka();
	}

}
// TITBIT : Collections are classes implementing interface Collection<E>. 