package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {
	public static void main(String[] args) throws IOException {
		FileIO io = new FileIO();
		io.writeToFile("newfile.txt", "tekst do pliku");
		System.out.println(io.readFromFile("newfile.txt"));
		io.writeToFile("hah.txt");

	}

	public String readFromFile(String fileName) throws IOException {
		FileReader reader = new FileReader(fileName);
		char[] buffer = new char[64];
		// nigdy nie wiadomo ile znaków wczytamy!
		int size = reader.read(buffer);
		reader.close();
		// nie ca³y bufor to znaki wczytane z pliku!
		return new String(buffer, 0, size);
	}

	public void writeToFile(String fileName, String txt) throws IOException {
		// jeœli plik nie istnia³ to ta instrukcja go utworzy!
		FileWriter writer = new FileWriter(fileName);
		// FileWriter writer = new FileWriter(fileName,true); to append text to
		// file, not override it.
		writer.write(txt);
		writer.close(); // nie zapomnijmy zamkn¹æ strumienia!
	}

	public String readFromFile2(String fileName) throws IOException {
		FileReader reader = new FileReader(fileName);
		// We ca create FileReader object by above constructor with file name or
		// File object, both create a directory file on disk.(Actually it works
		// for all streams.

		BufferedReader bufferedReader = new BufferedReader(reader);

		// Objects created only from instances of Reader subclasses.

		String txtLine = bufferedReader.readLine();
		// Thanks to BuffereReader we can use readLine().

		bufferedReader.close(); // zamyka tak¿e strumieñ reader
		return txtLine;
	}

	public void writeToFile(String fileName, String... txts) throws IOException {
		FileWriter writer = new FileWriter(fileName, false);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		for (String line : txts) {
			bufferedWriter.write(line);
			bufferedWriter.newLine(); // zapisuje sekwencjê nowej linii
		}
		bufferedWriter.close(); // zamyka tak¿e strumieñ writer
	}

	public void writeToFile(String fileName) throws IOException {
		PrintWriter printWriter = new PrintWriter(fileName);
		// PrintWrier is mainly for writing formatted characters to some source

		printWriter.println(3.4F);

		printWriter.println("Zapisze wszystko");

		printWriter.print(new Object());

		printWriter.close();
	}

	public void writeFormated() {
		PrintWriter printWriter = new PrintWriter(System.out);
		printWriter.format("PI to oko³o %f", Math.PI);
		// format(...) == printf(...) we can use it interchangeably.

		printWriter.format("%b", Math.PI);
		// If argument is of a different type than binary, we will receive
		// "true" , but if it's nul -> false.

		// printWriter.format("%d", Math.PI); we would receive exception,
		// because it's
		// a flag only for integral numbers.

		printWriter.format("E to %2$.4f a PI to %1$.4f", Math.PI, Math.E);
		// $ stands for decision which argument ( counting from 1 , not 0)
		// should be used.
		
		/* FLAGS :
		 * + for always showing the sign of a number.
		 * - for aligning ( wyrownywac ) numbers to the left , not right.
		 * 0 for fullfilling empty places with 0s not spaces. 
		 * ( for taking negative number into brackets. 
		 * */
		
		
		printWriter.close();

	}
}
// TITBIT : BufferedReader objects are constructed only from objects of Reader
// subclasses.
// TITBIT : FileWriter - contains methods which don't add end of line sign , so
// depending on OS we have to compose it on our own from \n and \r.
// BufferedWriter is analogic but adds thos signs.
// TITBIT : PrintWriter - shares few useful methods including print(...),
// printf(...), println(...) and format(...). 