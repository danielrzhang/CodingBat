package string2;

public class RepeatSeparator {

	public static String repeatSeparator(String word, String sep, int count) {
		String newString = "";

		for (int i = 0; i < count; i++) {
			if (i < count - 1) {
				newString += word + sep;
			} else {
				newString += word;
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
