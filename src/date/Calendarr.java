package date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendarr {
	public void dateTest() {
		Calendar calendar = Calendar.getInstance();

		Date date = calendar.getTime();

		System.out.println(date.toString());

		calendar.add(Calendar.MONTH, 2);

		date = calendar.getTime();
		System.out.println(date.toString());

		calendar.roll(Calendar.HOUR, 24);
		// roll is an equivalent for add, but whenever we add e.g. 24 h it
		// returns the same date This method is cyclic.
		date = calendar.getTime();
		System.out.println(date);

		DateFormat date1 = DateFormat.getTimeInstance(DateFormat.FULL);
		// DateFormat is used for formatting and parsing text format dates.
		// Available styles of formatting : FULL , LONG, MEDIUM and SHORT.

	}

	public void formatTest() {
		Date currentDate = new Date();
		
		DateFormat shortFormat = DateFormat.getInstance();
		DateFormat defaultDateFormat = DateFormat.getDateInstance();
		DateFormat longDateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat fullFormat = DateFormat.getTimeInstance(DateFormat.FULL);
		
		
		System.out.println(shortFormat.format(currentDate));
		System.out.println(defaultDateFormat.format(currentDate));
		System.out.println(longDateFormat.format(currentDate));
		System.out.println(fullFormat.format(currentDate));
	}

	public static void main(String[] args) {

		new Calendarr().dateTest();
	}

}
