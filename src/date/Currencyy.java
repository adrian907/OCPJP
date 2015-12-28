package date;

import java.text.NumberFormat;
import java.util.Locale;

public class Currencyy {

	public void formatTest() {
		NumberFormat curFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(curFormat.format(13.598));

		// NumberFormat is equivaent of DateFormat but for currency and numbers.

		curFormat = NumberFormat.getCurrencyInstance(); // currecny instance!
		System.out.println(curFormat.format(13.598));
		// When not explicitly assigning locale, default location is assigned.

		NumberFormat numFormat = NumberFormat.getInstance(Locale.UK);
		System.out.println(numFormat.format(13.598));

		numFormat = NumberFormat.getInstance();// number instance !
		System.out.println(numFormat.format(13.598));
		
		numFormat.setMaximumFractionDigits(5);
		System.out.println(numFormat.format(13.43234234234));// obvious.
		
		numFormat.setMinimumFractionDigits(4);
		System.out.println(numFormat.format(13.23));//obvious.
	}

	public static void main(String[] args) {
		new Currencyy().formatTest();
	}

}
//TITBIT : By defaut currency has 2 fraction digits, number have 3 !