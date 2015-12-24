package innerClasses;

class ExternalClass {
	public void someOp() {
		OuterClass2 outerInstance = new OuterClass2();
		// zwróæmy uwagê na sk³adniê u¿ycia operatora new
		OuterClass2.InnerClass innerInstance = outerInstance.new InnerClass(); 
		//When trying to use inner class we need to call superclass first as well as its object. 

		// mo¿na te¿ tak, tworz¹c jednoczeœnie instancjê klasy zewnêtrznej
		innerInstance = new OuterClass2().new InnerClass();
	}
}

class OuterClass2{
	private String value = "Zmienna prywatna";
	
	
	class InnerClass {
		int value =24;
		
		
		public String getOuterValue(int value) {
			int a = this.value;	// Calling field from inner class overridden in method. 
			return OuterClass2.this.value;	// In this way we call field "value " from external class.
		}
	}
}