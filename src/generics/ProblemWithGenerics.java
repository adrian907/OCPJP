package generics;

/*
 * PROBLEM WITH GENERICS 
 * */

import java.util.HashMap;
import java.util.Map;

public class ProblemWithGenerics {
	public static void main(String[] args) {
		Map<Integer, String> newMap = new HashMap<Integer, String>();

		OldClass oldClass = new OldClass();
		Map<Integer, String> processedMap = oldClass.oldOp(newMap);
		// tu dostaniemy wyj¹tek ClassCastException
	}
}

// stary kod
class OldClass {
	public Map oldOp(Map preGenericMap) {
		//preGenericMap.put(1, new Date()); // wartoœæ typu Date a nie String
		//put() generates an error because of possibility of an error. 
		
		return preGenericMap;
	}
}
