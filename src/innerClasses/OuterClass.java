package innerClasses;
//dependence between private fields and inner classes 


public class OuterClass {
	private String value = "Zmienna prywatna";

	class InnerClass {
		public String getOuterValue() {
			return value; // dost�p do zmiennej prywatnej
		}
	}

	public String getValue() {
		return value;
	}
}