package method_local_inner_classes;

public class OuterClass2 {
	public static void main(String[] args) {
		OuterClass2 outerClassInstance = new OuterClass2();

		// referencja obj bêdzie wskazywa³a na obiekt typu MethodLocalClass
		Object obj = outerClassInstance.someOp();
		System.out.println(obj.toString());
	}

	public Object someOp() {
		final strictfp class MethodLocalClass {
			public String toString() {// These classes can be: abstract,final or
										// strictfp.
				// not public, private or protected.
				return "Instancja klasy MethodLocalClass!";
			}
		}
		return new MethodLocalClass();

	}// We can't declare type of a local class as a return type or define
		// a reference to this class beyond the method in which class was
		// defined. But we can return an instance of this class and assign it to
		// some not local supertype.
}
// TITBIT : Instances of method local inner classes are kept on a heap like
// normal objects.
// TITBIT : Local method inner classes don't have access to local variables of
// methods, unless we declare a variable as final.
// TITBIT : If a method in which we declare a class is static -> we have access
// only to static fields from superclass(not method), otherwise they have access
// to all of the fields.
