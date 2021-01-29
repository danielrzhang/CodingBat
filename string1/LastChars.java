package string1;

public class LastChars {

	public static String lastChars(String a, String b) {
		if (a.length() < 1) {
			a = "@";
		}
		if (b.length() < 1) {
			b = "@";
		}
		return a.charAt(0) + "" + b.charAt(b.length() - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
