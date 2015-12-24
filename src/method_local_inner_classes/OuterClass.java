package method_local_inner_classes;

public class OuterClass { // klasa zewn�trzna
	public void someOp() {
		class MethodLocalClass { // klasa lokalna metody someOp()
			public int x = 1;
		}
		// instancje klasy lokalnej metody mo�emy utworzy� tylko w tej
		// metodzie
		MethodLocalClass localClassInstance = new MethodLocalClass();
		//local class must be defined in method above its first use.
	}
}