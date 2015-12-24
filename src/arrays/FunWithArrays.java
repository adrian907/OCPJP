package arrays;

public class FunWithArrays {

	public static void main(String[] args) {
		printArray(new int[] { 1, 2, 3, 4 });

		byte[][] myTable = { { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };
		// Another different type of table initialization.

		Number[][] Table = { new Byte[] { 1, 2 }, new Short[] { 1, 2, 3 },
				{ 1, 2 } };
		for (Number[] table : Table) {// Look at a superclass!
			for (Number x : table)
				System.out.print(x + " ");

		}
	}

	public static void printArray(int[] someArr) {
		for (int x : someArr)
			System.out.print(x +" ");
		System.out.println();
	}

}
