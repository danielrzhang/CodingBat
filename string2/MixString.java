package string2;

public class MixString {

	public static String mixString(String a, String b) {
		String newString = "";
		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			newString += a.substring(i, i + 1) + b.substring(i, i + 1);
		}

		if (b.length() > a.length()) {
			newString += b.substring(a.length());
		} else if (b.length() < a.length()) {
			newString += a.substring(b.length());
		}
		return newString;
	}

	public static void main(String[] args) {

	}

}
