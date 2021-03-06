package static_nested_classes;

import java.util.Date;

class Notepad {
	private static Date lastCreatedDate;

	static class Note {
		private Date creationDate;

		public Date getCreationDate() {
			return creationDate;
		}

		public Date getLastCreatedDate() {
			// statyczna zmienna prywatna klasy zewnętrznej
			return lastCreatedDate;
		}
	}

	public static Note newNote() {
		Note art = new Note();
		art.creationDate = new Date(); // zmienna prywatna z klasy wewnętrznej
		lastCreatedDate = art.creationDate;
		return art;
	}
}