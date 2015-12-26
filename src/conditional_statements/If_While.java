package conditional_statements;

public class If_While {

	public static void main(String[] args) {
		boolean a;
		// if(1) Condition must always be of boolean type as well as in while!
		if (a = true) { // operator przypisania zamiast operatora równoœci a i
						// tak dziala !
			a = false;
		}
		System.out.println(a);

		if (1 == 2)
			if (2 == 3)
				System.out.println("1 == 2 & 2 == 3");
			else
				System.out.println("1 != 2");
	}
	// Remember that else is always connected with the most nested instruction.
}	//
