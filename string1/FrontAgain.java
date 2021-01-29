package string1;

public class FrontAgain {

	public static boolean frontAgain(String str) {
		if (str.length() >= 2) {
			if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
