package collections;

import java.util.HashMap;
import java.util.Map;

/*
 *COLLECTIONS : 
 * Lists - classes implementing interface List. 
 * Sets - classes implementing interface Set.
 * Queues - classes implementing interface Queue.
 */

public class DataStructures {

	public static void main(String[] args) {
		Map<Address, Flat> flats = new HashMap<Address, Flat>();
		// blok nr. 8, mieszkanie 104
		Address ad = new Address(8,104);
		flats.put(ad , new Flat());
		// obiekt nie zostaje odnaleziony, mimo ¿e tam jest

		Flat flat = flats.get(ad);
		Flat flat2 = flats.get(new Address(8, 104));

		// get ( key )
	//	flats.remove(new Address(8, 104));
		// remove( key )
		
		System.out.println(flats.containsKey(ad));
		System.out.println(flats.containsValue(flat));
		
		System.out.println(flats.containsKey(new Address(8,104)));
		//Stupid mistake was made above before . 
	}
}

class Address {
	int building;
	int flat;

	public Address(int building, int flat) {
		this.building = building;
		this.flat = flat;
	}
}

class Flat {
	// dowolna implementacja klasy
}