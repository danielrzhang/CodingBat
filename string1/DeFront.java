package string1;

public class DeFront {

	public static String deFront(String str) {
		if (str.length() < 2) {
			if (str.charAt(0) == 'a') {
				return str.substring(1);
			} else {
				return str;
			}
		} else {
			if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
				return str;
			} else if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
				return "a" + str.substring(2);
			} else if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
				return str.substring(1);
			}
		}
		return str.substring(2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
