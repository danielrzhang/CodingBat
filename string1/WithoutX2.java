package string1;

public class WithoutX2 {

	public static String withoutX2(String str) {
		if (str.length() == 0) {
			return str;
		} else if (str.length() == 1) {
			if (str.equals("x")) {
				return "";
			} else {
				return str;
			}
		} else {
			if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
				return str.substring(2);
			} else if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
				return str.substring(1);
			} else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
				return str.charAt(0) + str.substring(2);
			} else {
				return str;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
