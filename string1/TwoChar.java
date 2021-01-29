package string1;

public class TwoChar {

	public static String twoChar(String str, int index) {
		if (index + 1 >= str.length() || index < 0) {
			return str.substring(0, 2);
		} else {
			return str.substring(index, index + 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
