package constructor;

class Parent1{
	String str = "some value";
}

class Child extends Parent1 {
	String childStr = "some other value";
}

// •Wywo³ywany jest domyœlny konstruktor klasy Child. Jego pierwsz¹
// instrukcj¹ jest wywo³anie super().

// • Wywo³ywany jest domyœlny konstruktor klasy Parent. Jego pierwsz¹
// instrukcj¹ jest wywo³anie super().

// • Wywo³ywany jest konstruktor w klasie Object, ta nie ma ju¿ nadklas,
// wiêc po wykonaniu kodu konstruktora nastêpuje powrót do konstruktora z
// klasy Parent.

// • Wykonywana jest inicjalizacja zmiennych instancyjnych w klasie
// Parent, a wiêc przypisanie str = "some value", po czym
// nastêpuje powrót do konstruktora z klasy Child.

// • Wykonywana jest inicjalizacja zmiennych instancyjnych w klasie Child,
// a wiêc przypisanie childStr = "some other value", co jest
// ostatnim krokiem. Obiekt zosta³ utworzony i zainicjalizowany