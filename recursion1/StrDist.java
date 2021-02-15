package recursion1;

public class StrDist {
	public int strDist(String str, String sub) {
		if (str.equals(sub)) {
			return sub.length();
		}

		else if (str.length() < sub.length()) {
			return 0;
		}

		else if (str.substring(0, sub.length()).equals(sub)) {
			if (str.substring(str.length() - sub.length()).equals(sub)) {
				return str.length();
			}

			return strDist(str.substring(0, str.length() - 1), sub);
		}

		return strDist(str.substring(1), sub);
	}

}
