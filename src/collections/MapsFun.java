package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapsFun {

	public void rmTest() {
		Map<String, Integer> map = new HashMap<>();
		// HashTable<K,V> differs from HashMap; its methods are synchronized and
		// value of a K or V can not be a null.

		// LinkedHashMap - allows connections between elements of map, so we can
		// make a two-side linked list out of it.

		map.put("A", 12);
		map.put("B", 15);
		map.put("C", 121);
		System.out.println(map.containsKey("A"));

		Set<String> set = map.keySet();
		// Set<K> Keyset - allows to see the map as a collection of keys.

		set.remove("A");// removing by key.
		// usuniêcie klucza ze zbioru kluczy usuwa tak¿e skojarzenie z mapy

		System.out.println(map.containsKey("A"));
		// What was done in a keyset is done in a map.

		Collection<Integer> collection = map.values();
		// Equivalent for values is values().
		// collection.add(12); - forbidden, we don't know nothing about String.

		// collection.remove(15);// removing by value.
		//
		System.out.println(collection.isEmpty());

		Set<Map.Entry<String, Integer>> pairs = map.entrySet();
		// Returns a set of pairs in brackets.
		System.out.println(pairs);
	}

	public void LinkedHashLists() {
		LinkedHashMap<Integer, String> hash = new LinkedHashMap<Integer, String>();
		hash.put(30, "Maciek");
		hash.put(22, "Diana");
	}

	public void Sortin() {
		NavigableMap<Integer, String> sort = new TreeMap<>();
		sort.put(11, "F");
		sort.put(2, "D");
		sort.put(3, "A");

		// SortedMap<Integer, String> sortt = new TreeMap<>(); forbidden because
		// TreeMap doesn't implement sortedMap interface.

		// SortedMap and NavigableMap are interfaces.

		NavigableMap<Integer, String> sort1 = sort.headMap(2, true);
		// For NavigableMap methods are overloaded with second boolean argument.
		System.out.println(sort1);

		NavigableMap<Integer, String> sort2 = sort.tailMap(2, false);
		System.out.println(sort2);

		NavigableMap<Integer, String> sort3 = sort.subMap(1, true, 111, true);
		// Even though 1 is not in the map, there's no exception thrown.
		// Keys are written out lexycographically.

		sort3.remove(11);

		System.out.println(sort3);

		sort3.put(22, "Lol"); // PUTTING E.G. 222 in sort3 where max value is
								// 111 would cause neverending loop.

		System.out.println(sort.containsKey(22));
		System.out.println(sort3);

		NavigableMap<Integer, String> reverse = sort.descendingMap();
		System.out.println(reverse);
		// Just reversing the map KEY order.

		Set<Integer> set2 = sort.descendingKeySet(); // Sorted descendingly
														// keyset.
		System.out.println(set2);

		reverse.put(78, "HOla");
		System.out.println(reverse + "\t\t " + sort);

		System.out.println(sort.ceilingKey(15) + " " + sort.firstKey() + " "
				+ sort.floorKey(5000) + " " + sort.higherKey(8));

		// The same methods are available for pairs of key-value, but obviously
		// with different return type .
		Entry<Integer, String> sortn = sort.ceilingEntry(43);
		System.out.println(sortn);
		sortn = sort.lowerEntry(12);
		System.out.println(sortn);

		// Removing last item.
		sort.pollLastEntry();
		System.out.println(sort);

		// Removing first item.
		sort.pollFirstEntry();
		System.out.println(sort);
	}

	public static void main(String[] args) {
		// new MapsFun().rmTest();
		new MapsFun().Sortin();
	}
}
// TITBIT : Class responsible for keys must implement equals and hashcode
// methods.

// TITBIT : Interface widening Map<K,V> with methods allowing to sort map by
// key. Those methods allow to create a daughter-map which will be a "view" of
// mother-map.

