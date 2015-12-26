package constructor;

public class ConstructorSuperError {
	private int x;

	public ConstructorSuperError(int x) {
		this.x = x;
	}
}

// public class OtherClass extends ConstructorSuperError {
// }

// Again only in in comment. 
//Dla klasy OtherClass nie zdefiniowano �adnego konstruktora a wi�c
//kompilator wygenerowa� konstruktor domy�lny. Konstruktor domy�lny
//zawiera wywo�anie super(). Dla klasy NewClass
//zdefiniowano konstruktor jednoargumentowy, wi�c kompilator nie wygenerowa�
//konstruktora domy�lnego. Nie zosta� te� taki konstruktor zdefiniowany explicite a
//wi�c wywo�anie super() znajduj�ce si� w wygenerowanym dla klasy
//OtherClass konstruktorze domy�lnym a b�d�ce wywo�aniem nieistniej�cego
//konstruktora bezargumentowego z nadklasy NewClass nie jest prawid�owe.