package date;

import java.util.Date;

public class Example {

	public void dateTest() {
		Date currentTime = new Date();

		long currentTimeInMillis = currentTime.getTime();
		// Amount of miliseconds from 1 I 1970;
		System.out.println(currentTimeInMillis);

		Date nextDay = new Date(currentTimeInMillis + 24 * 3600000);
		// Another type of constructor.

		System.out.println(nextDay.toString());
		// Overloade version of toString for Date class.

		nextDay.setTime(nextDay.getTime() + 24 * 3600000);
		//Setting a new date . 
		System.out.println(nextDay.toString());
	}
	
	public static void main (String[] args){
		new Example().dateTest();
	}

}
