package package1;

/*
 * PRZEKAZYWANIE OBIEKTÓW PRZEZ WARTOŒÆ. 
 * */

public class Test3 {
	public static void main(String[] args) {
		SomeClass obj = new SomeClass();
		triple(obj);	//References are referred by value just like primitives. We obtain only a copy of them.
		System.out.println("x: " + obj.getX());
	}

	static void triple(SomeClass obj) {
		obj.setX(obj.getX() * 3);
	}
}

class SomeClass {
	int x = 2;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}