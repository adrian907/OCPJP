package package1;

/*
 * FEEL THE DIFFERENCE WITH TEST3!
 * */

public class Test4 {
	public static void main(String[] args) {
		SomeClass obj = new SomeClass();
		triple(obj);
		System.out.println("x: " + obj.getX());
	}

	static void triple(SomeClass obj) {
		SomeClass localObj = new SomeClass();
		localObj.setX(obj.getX() * 3);
		obj = localObj;
		// Here we have already a completely different reference than the
		// parameter. We have changed it and that's why it has nothing in common
		// with our object from main method.

	}
}