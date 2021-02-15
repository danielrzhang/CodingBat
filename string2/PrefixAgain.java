package string2;

public class PrefixAgain {

	public static boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);

		if (str.length() == 2) {
			if (str.substring(0, 1).equals(str.substring(1, 2))) {
				return true;
			}
			return false;
		} else {
			for (int i = 1; i < str.length() - n; i++) {
				if (str.substring(i, i + n).equals(prefix)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		prefixAgain("aa", 1);
	}

}
