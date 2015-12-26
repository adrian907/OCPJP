package references;
/*
 * CASTING REFERENCES. DOWNCASTING AND UPCASTING.
 * */

class Parent {
	void doSomething() {
	}
}

class Child extends Parent {
	void doMore() {
	}
}

public class Test {
	public static void main(String[] args) {
		Parent obj = new Parent();
		((Child) obj).doMore(); // b³¹d wykonania! Not compilation error but execution.
		// reference is of type Parent as well as object. This action id forbidden. 
	}	//ClassCastException.
}
//TITBIT: Compiler will protest when the type of casting is not a subtype or supertype of a class.
//	e.g.			Number num = new Integer(1);		String str = ((String) num); 
//						downcasting and upcasting !
//Upcasting example : Number num = new Integer(1);			((Object)num).toString();