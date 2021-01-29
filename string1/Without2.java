package string1;

public class Without2 {

	public static String without2(String str) {
		if (str.length() >= 2) {
			if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
				return str.substring(2);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
