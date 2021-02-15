package string2;

public class CatDog {

	public static boolean catDog(String str) {
		int catCounter = 0;
		int dogCounter = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				catCounter++;
			} else if (str.substring(i, i + 3).equals("dog")) {
				dogCounter++;
			}
		}
		return catCounter == dogCounter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
