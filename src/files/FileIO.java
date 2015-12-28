package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) throws IOException {
		FileIO io = new FileIO();
		io.writeToFile("newfile.txt", "tekst do pliku");
		System.out.println(io.readFromFile("newfile.txt"));
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
}
//TITBIT : BufferedReader objects are constructed only from objects of Reader subclasses. 