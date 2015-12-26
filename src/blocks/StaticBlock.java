package blocks;
/*
 * USE OF STATIC AND INSTANCE BLOCKS.
 * */
public class StaticBlock {

	public StaticBlock() {
		System.out.println("constructor");
	}
	//If block throws exception , java.lang.ExceptioInInitializerError occurs. 
	static {
		System.out.println("static init block"); // Static block is invoked
													// before any instruction.
	}

	{
		System.out.println("instance init block");
		// Instance block is invoked after constructor uses super(...)
		// (or this(...) ) instruction, unless the constructor from superclass
		// uses super too and this class has also instance blocks..
	}

	{
		System.out.println("Another instance block");
		// This will be invoked as a second because compiler executes blocks
		// from up to down.
	}

	public static void main(String[] args) {
		System.out.println("start main");

		StaticBlock test = new StaticBlock();

		System.out.println("end main");
	}
}