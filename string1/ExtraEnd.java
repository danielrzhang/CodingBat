package string1;

public class ExtraEnd {

	public static String extraEnd(String str) {
		String newString = "";
		for (int i = 0; i < 3; i++) {
			newString += str.substring(str.length() - 2);
		}
		return newString;
	}

	public static void main(String[] args) {

	}

}
