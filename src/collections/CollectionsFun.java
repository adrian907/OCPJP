package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsFun {

	public void Kolejka() {
		Queue<Integer> kol = new PriorityQueue<>();
		// Its methods are not synchronized.

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

		// LinkedList<E> is a FIFO type of queue, implements List<E> and
		// Queue<E>.

	}

	public void PriorityQue() {
		Queue<Integer> prior = new PriorityQueue<>();
		prior.offer(23);
		prior.offer(11);
		prior.offer(997);
		System.out.println(prior);
		System.out.println();
	}

	public void Iterat() {
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

	public void Lista() {
		List<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(34);
		list.add(12);
		list.add(872);
		list.add(23);
		System.out.println(list);
		System.out.println(list.indexOf(12));

		// Returns element , counting from 0. Doesn't delete him.
		System.out.println(list.get(3));
		System.out.println(list);

		list.remove(1); // Removes element counting from 0 .
		System.out.println(list);

	}

	public void Zbior() {
		Set<Integer> zbior = new HashSet<>();
		// Simple set.

		Set<Integer> zbior21 = new LinkedHashSet<>();
		// The difference between this and above one is that elements from
		// LinkedHashSet make a list.

		NavigableSet<Integer> zbior2 = new TreeSet<>();
		// Just like for maps, TreeSet implements NavigableSet() and can use al
		// of its methods, just like TreeMap with NavigableMap.
		
		zbior.add(12);
		zbior.add(24);
		zbior.add(12);
		
		NavigableSet<Integer> subset = zbior2.headSet(24, true);
		System.out.println(zbior);
	}

	public static void main(String[] args) {
		new CollectionsFun().Zbior();
	}

}
// TITBIT : Collections are classes implementing interface Collection<E>.
// TITBIT : ArrayList and Vector are implemented on arrays . VEctor's methods
// are synchronized.