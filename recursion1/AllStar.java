package recursion1;

public class AllStar {
	public String allStar(String str) {
		if (str.length() <= 1) {
			return str;
		}

		else {
			return str.charAt(0) + "*" + allStar(str.substring(1));
		}

	}

}
