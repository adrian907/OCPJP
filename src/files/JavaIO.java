package files;

import java.io.File;
import java.io.IOException;

public class JavaIO {

	public static void main(String[] args) throws IOException {

		File file = new File("firstFile.txt");
		File newF = new File("2ndFile.txt");
		File dir = new File("testyF");

		dir.mkdir();
		File f = new File("testyF/subfile.txt"); // Created new file in folder
													// testyF.
		f.createNewFile();

		File dir2 = new File("testyF/test2/fn.txt");
		dir2.mkdirs();

		File f2 = new File("testyF/tes");
		f2.mkdir();
		System.out.println(file.exists());

		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.length());
		System.out.println(file.renameTo(newF));

		for (String fileName : dir.list())
			System.out.println(fileName);

		// System.out.println(f2.delete());
		// System.out.println(f.delete()); //If we'll try to delete not empty
		// file IOException.
	}
}
// TITBIT : java.io package contains few dozens of classes and interfaces.
// TITBIT : Reader and Writer are abstract classes used for reading and writing
// character sources. They are not connected with each other, both inherit from
// java.lang.Object.

// BufferedReader - used for minimizing amount of readings from some source,
// data is stored in buffer,read in big portions, so we don't use the source
// that
// often. That's why amount of true readings isn't that big. Especially useful
// when reading from disk.

// TITBIT : Source is called one of classes Reader, Writer,InputStream,
// OutputStream. Last 2 of them are oly for byte streams. 