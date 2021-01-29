package string1;

public class HasBad {

	public static boolean hasBad(String str) {
		if (str.length() < 3) {
			return false;
		} else {
			if (str.substring(0, 3).equals("bad")) {
				return true;
			}
			else if (str.length() >= 4) {
				if (str.substring(1, 4).equals("bad")) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
