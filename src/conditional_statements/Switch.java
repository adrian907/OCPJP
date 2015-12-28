package conditional_statements;

public class Switch {

	public static void main(String[] args) {
		byte x = 3;
		final byte b;
		b = 23;
		switch (x) {// Statement x can also be sth to count, not just a
					// variable.
		// case 1: // b³¹d – dwa warianty dla tej samej wartoœci
		// System.out.println("jeden");		break;

		case 1: // b³¹d – dwa warianty dla tej samej wartoœci
			System.out.println("one");
			break;
		// case b: break;
		// Can't initialize final variable after it's declaration.

		// case 128: break; // can't do this, because arguments of cases must be
		// automatically casted to switch's statement's type.

		default:// There can be at most one default instruction (it's optional).
				// It can appear anywhere in switch statement, not only at the
				// end. If there is not default instruction, and we don't have
				// suitable case, then switch instruction will be left without
				// performing any action.
			System.out.println("hi");
			break;
		}
	}
}
// TITBIT : Types of variables in switch statement can only be : byte, char, int
// short and their wrappers.
// TITBIT : Arguments for cases must be known while compiled - it means they can
// obly be literals or final variables.