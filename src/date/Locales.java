package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Locales {

	public void parseTest() throws ParseException {
		DateFormat fiFormat = DateFormat.getDateInstance(DateFormat.LONG,
				new Locale("fi"));
		Date date = fiFormat.parse("19. helmikuuta 2009");
		DateFormat frFormat = // mo¿e byæ tak¿e new Locale("fr")
		DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH);
		date = frFormat.parse("19 février 2009");
	}

	public void parseTest2() throws ParseException {
		DateFormat fiFormat = DateFormat.getDateInstance(DateFormat.LONG,
				new Locale("fi"));
		Date date = fiFormat.parse("19. helmikuuta 2009");
		DateFormat frFormat = // mo¿e byæ tak¿e new Locale("fr")
		DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH);
		// Some of the most common locales are defined as static variables.
		// Example above.
		date = frFormat.parse("19 février 2009");

		DateFormat form = DateFormat.getDateInstance(DateFormat.FULL,
				Locale.ENGLISH);
		Date dat = form.parse("12 October 2123");
		System.out.println(dat);
	}

	public void formatTest() {
		Date currentDate = new Date();
		DateFormat frFormat = DateFormat.getDateInstance(DateFormat.FULL,
				new Locale("fr", "FR"));
		// dateFormat can also format date for specific time-zone, country and
		// even language.

		DateFormat chFormat = DateFormat.getDateInstance(DateFormat.FULL,
				new Locale("fr", "CH"));
		System.out.println(frFormat.format(currentDate));
		System.out.println(chFormat.format(currentDate));
	}

	public void localeTest() {
		Locale enLocale = new Locale("en");
		Locale plLocale = new Locale("pl", "PL");
		Locale pl2 = new Locale("PL");
		System.out.println(plLocale.getDisplayCountry());
		
		System.out.println(plLocale.getDisplayLanguage());
		System.out.println(plLocale.getDisplayCountry(enLocale));
		System.out.println(pl2.getDisplayCountry());
		//Empty text when not applying country.
		System.out.println(plLocale.getDisplayLanguage(enLocale));
		
	}

	public static void main(String[] args) {
			new Locales().localeTest();

	}
}
// public Locale(String language)
// public Locale(String language, String country)