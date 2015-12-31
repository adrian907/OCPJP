package generics;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// Making an array and treating it like a list .
		List<Float> floatsList = Arrays.asList(1F, 12F, 3F, 14F, 5F);

		GetMaxProcessor<Float> maxProcessor = new GetMaxProcessor<Float>();
		// funkcja process(...) zwraca rezultat typu Float
		Float max = maxProcessor.process(floatsList);
	}
}

// Bounded parametrized type .
// Looking for maximum value .
class GetMaxProcessor<T extends Number> {
	public T process(List<T> numsList) {
		T max = numsList.get(0); // za³ó¿my ¿e lista jest niepusta
		for (T num : numsList)
			if (num.doubleValue() > max.doubleValue())
				max = num;
		return max; // wartoœæ zwracana jest tego samego typu co liczby z listy
	}
}