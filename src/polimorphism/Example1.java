package polimorphism;

/*
 * CLUE OF ISOMORPHISM. 
 * */

public class Example1 {
	class Parent {
		void testFromParent() {
		}
	}

	class Child extends Parent {
		void testFromChild() {
		}
	}

	class Test {
		void test() {
			Parent p = new Child();
			p.testFromParent();
			// b³¹d!
			// p.testFromChild(); -- reference type is Parent, that's why we
			// can't execute method from class Child.
		
			((Child)p).testFromChild();	// Correct- casting to child.
		}
	}
}
//TITBIT: We can assign any type of object to reference only if it's the same class or subclass object.
//TITBIT: Type of reference can be stated by interface, class or enum type. 
