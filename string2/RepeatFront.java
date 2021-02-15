package string2;

public class RepeatFront {

	public static String repeatFront(String str, int n) {
		String newString = "";

		for (int i = n - 1; i >= 0; i--) {
			newString += str.substring(0, i + 1);
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
