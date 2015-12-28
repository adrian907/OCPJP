package string;

public class Buffer {

	static StringBuilder str = new StringBuilder("Ad");

	public static void main(String[] args) {
		str = str.append("rian");
		System.out.println(str);

		str = str.delete(3, 4);
		System.out.println(str);
		
		str = str.insert(3,"i");
		System.out.println(str);
	
		str=str.reverse();
		System.out.println(str);
		
		
	}
}
// TITBIT : StringBuffer - synchronized class , the only difference with
// StringBuilder. Represents a modifiable sequence of characters.

