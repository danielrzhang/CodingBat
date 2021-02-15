package string2;

public class RepeatEnd {

	public static String repeatEnd(String str, int n) {
		String newString = "";

		for (int i = 0; i < n; i++) {
			newString += str.substring(str.length() - n);
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
