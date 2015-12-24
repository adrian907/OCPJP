package static_nested_classes;

class ExternalClass {
	void externalTest() {
		Notepad2.Note.Line line = new Notepad2.Note.Line();
	}
}

class Notepad2{
	static class Note {
		static class Line {
		}

		void noteTest() {
			Line line = new Line();
			// mo¿na te¿ tak - za du¿o nie ma nigdy
			Notepad2.Note.Line nextLine = new Notepad2.Note.Line();
		}
	}

	void notepadTest() {
		Note.Line line = new Note.Line();
	}
}