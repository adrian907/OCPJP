package static_methods;

/*
 * REDEFINING STATIC METHOD EXAMPLE.
 * */


class Parent {
	static String getDescr() { // delete both static words and te result will be
								// "parent child" - overriding example.
		return "parent";
	}
}

class Child extends Parent {
	static String getDescr() {// delete both static words and te result will be
								// "parent child"- overriding example.
		return "child";
	}
}

public class RedefineEx2 {
	public static void main(String[] args) {
		Parent obj = new Parent();
		System.out.println(obj.getDescr()); //
		obj = new Child(); // "parent" written twice.
		System.out.println(obj.getDescr());//
	}
}
// TITBIT : Redefining - defining static method in subclass which was already
// defined in superclass.
// Static fields and methods belong to class.