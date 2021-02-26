package string2;

public class BobThere {

	public static boolean bobThere(String str) {
		if (str.length() < 3) {
			return false;
		} else {
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
					return true;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
