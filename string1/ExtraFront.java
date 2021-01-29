package string1;

public class ExtraFront {

	public static String extraFront(String str) {
		if (str.length() >= 2) {
			return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
		} else {
			return str + str + str;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
