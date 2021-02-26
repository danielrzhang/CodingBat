package string2;

public class DoubleChar {

	public static String doubleChar(String str) {
		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			newString += str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
