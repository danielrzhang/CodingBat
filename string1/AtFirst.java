package string1;

public class AtFirst {

	public static String atFirst(String str) {
		if (str.length() < 2) {
			for (int i = 0; i <= 2 - str.length(); i++) {
				str += '@';
			}
			return str;
		} else {
			return str.substring(0, 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
