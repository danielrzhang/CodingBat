package string1;

public class WithoutEnd2 {

	public static String withoutEnd2(String str) {
		if (str.length() < 2) {
			return "";
		} else {
			return str.substring(1, str.length() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
