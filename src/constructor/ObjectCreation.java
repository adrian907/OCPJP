package constructor;

class Parent1{
	String str = "some value";
}

class Child extends Parent1 {
	String childStr = "some other value";
}

// �Wywo�ywany jest domy�lny konstruktor klasy Child. Jego pierwsz�
// instrukcj� jest wywo�anie super().

// � Wywo�ywany jest domy�lny konstruktor klasy Parent. Jego pierwsz�
// instrukcj� jest wywo�anie super().

// � Wywo�ywany jest konstruktor w klasie Object, ta nie ma ju� nadklas,
// wi�c po wykonaniu kodu konstruktora nast�puje powr�t do konstruktora z
// klasy Parent.

// � Wykonywana jest inicjalizacja zmiennych instancyjnych w klasie
// Parent, a wi�c przypisanie str = "some value", po czym
// nast�puje powr�t do konstruktora z klasy Child.

// � Wykonywana jest inicjalizacja zmiennych instancyjnych w klasie Child,
// a wi�c przypisanie childStr = "some other value", co jest
// ostatnim krokiem. Obiekt zosta� utworzony i zainicjalizowany