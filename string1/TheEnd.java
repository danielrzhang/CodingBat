package string1;

public class TheEnd {

	public static String theEnd(String str, boolean front) {
		if (front) {
			return Character.toString(str.charAt(0));
		} else {
			return Character.toString(str.charAt(str.length() - 1));
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
