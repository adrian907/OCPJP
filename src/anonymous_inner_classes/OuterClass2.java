package anonymous_inner_classes;

public class OuterClass2 {
	public static void main(String[] args) {
		class InnerClass { // klasa lokalna metody
			void printId(double num) {
				System.out.println("Klasa lokalna metody");
			}
		}
		// klasa anonimowa dziedziczy z klasy lokalnej InnerClass
		InnerClass innerClassInstance = new InnerClass() {
			// to jest przeci¹¿enie a nie nadpisanie metody z klasy InnerClass
			void printId(int num) {
				System.out.println("Anonimowa klasa lokalna");
			}
		};
		innerClassInstance.printId(123);
	}
}