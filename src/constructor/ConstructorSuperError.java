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
//Dla klasy OtherClass nie zdefiniowano ¿adnego konstruktora a wiêc
//kompilator wygenerowa³ konstruktor domyœlny. Konstruktor domyœlny
//zawiera wywo³anie super(). Dla klasy NewClass
//zdefiniowano konstruktor jednoargumentowy, wiêc kompilator nie wygenerowa³
//konstruktora domyœlnego. Nie zosta³ te¿ taki konstruktor zdefiniowany explicite a
//wiêc wywo³anie super() znajduj¹ce siê w wygenerowanym dla klasy
//OtherClass konstruktorze domyœlnym a bêd¹ce wywo³aniem nieistniej¹cego
//konstruktora bezargumentowego z nadklasy NewClass nie jest prawid³owe.