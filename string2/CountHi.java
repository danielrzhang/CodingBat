package string2;

public class CountHi {

	public static int countHi(String str) {
		int counter = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
