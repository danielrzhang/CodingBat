package recursion1;

public class CountHi2 {
	public int countHi2(String str) {
		if (str.length() <= 1) {
			return 0;
		}

		if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
			return 1 + countHi2(str.substring(2));
		}

		if (str.charAt(0) == 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i') {
			return countHi2(str.substring(3));
		}

		else {
			return countHi2(str.substring(1));
		}
	}

}
