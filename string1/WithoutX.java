package string1;

public class WithoutX {

	public static String withoutX(String str) {
		if (str.length() < 2) {
			if (str.equals("x")) {
				return "";
			} else {
				return str;
			}
		}
		if (str.charAt(0) == 'x') {
			str = str.substring(1);
		}
		if (str.charAt(str.length() - 1) == 'x') {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
