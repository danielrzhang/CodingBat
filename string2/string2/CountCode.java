package string2;

public class CountCode {

	public static int countCode(String str) {
		int codeCounter = 0;

		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
				codeCounter++;
			}
		}
		return codeCounter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
