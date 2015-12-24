package innerClasses;

class ExternalClass1 {
	public void someOp() {
		OuterClass1 outerInstance = new OuterClass1();
		OuterClass1.InnerClass innerInstance = outerInstance.getInstance();
	}
}

class OuterClass1 {
	private String value = "Zmienna prywatna";

	class InnerClass {
		public String getOuterValue() {
			return value;
		}
	}

	public InnerClass getInstance() {
		return new InnerClass();
	}
}