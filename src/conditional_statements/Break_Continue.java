package conditional_statements;

public class Break_Continue {

	public static void main(String[] args) {
		int i = 0;
		for (System.out.println("sekcja 1."); condition(); System.out
				.println("sekcja 3.")) {
			System.out.println("cia³o pêtli");
			if (i++	> 0)//WORKS! 	
				break;
		}
		System.out.println("po pêtli");
	}

	public static boolean condition() {
		System.out.println("sekcja 2. (true)");
		return true;
	}
}
