package generics;

import java.util.List;

public class ParamMethod {
	 public static void main(String[] args){
	 }
}

class GetMaxProcessor2 { // klasa nie jest ju¿ generyczna
	// za to generyczna jest metoda
	public <T extends Number> T process(List<T> numsList) {
		// <T extends Number> is informing compiler that T is not a type, but a
		// parameter. T is a returned Type!
		T max = numsList.get(0); // za³ó¿my ¿e lista jest niepusta
		for (T num : numsList)
			if (num.doubleValue() > max.doubleValue())
				max = num;
		return max;
	}
	
	public <T> T newmeth(T max){
		return max; 
	}
}