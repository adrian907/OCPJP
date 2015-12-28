package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * META-SIGNS:
 * \w - any letter, digit or _   . 	
 * \d - any number. 
 * \s - sign of tabulation, space, new line etc. (white spaces)
 * . - any sign
 * 
 * 
 * 
 * a[b-eg]f - first sign is a , later any from b to e or g, the last is f.
 * + - preceding sign can occur more than once.
 * * - given sign can occur not even once . 
 * ? - preceding sign is optional. 
 */

public class Patternn {
	public void searchTest() {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher("a 1 b 12 c 123");
		while (matcher.find())
			// find() returns true if pattern was found.

			System.out.println(matcher.start() + ", " + matcher.group());
		// start() - returns position of first character of found pattern.
		// group() - returns found pattern.
		Pattern pattern2 = Pattern.compile("-?\\d+[\\.\\d]+");
		//Any integer number with or without fraction part.
		Pattern patt = Pattern.compile("[Aa]..");
		//Any 3-character length string starting with A or a.
		Matcher match = pattern2.matcher("124.32 -12 092.3"); 
		while (match.find())
			// find() returns true if pattern was found.

			System.out.println(match.start() + ", " + match.group());
	}

	public static void main(String[] args) {
		new Patternn().searchTest();
	}

}
// java.util.regex - package; classes in it : Pattern and Matcher are
// responsible for searching a pattern in text . 