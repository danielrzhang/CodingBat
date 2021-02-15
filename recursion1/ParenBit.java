package recursion1;

public class ParenBit {
	public String parenBit(String str) {
		if (str.length() == 0) {
			return str;
		}

		if (str.charAt(0) == '(') {
			return str.charAt(0) + str.substring(1, str.indexOf(')') + 1);
		}

		else {
			return parenBit(str.substring(1));
		}
	}

}
