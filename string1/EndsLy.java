package string1;

public class EndsLy {

	public static boolean endsLy(String str) {
		if (str.length() < 2) {
			return false;
		}
		if (str.substring(str.length() - 2).equals("ly")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
