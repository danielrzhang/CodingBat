
public class WordEnds {

	public static String wordEnds(String str, String word) {
		String newString = "";

		for (int i = 0; i < str.length() - word.length() + 1; i++) {
			String temp = str.substring(i, i + word.length());
			if (i > 0 && temp.equals(word)) {
				newString += str.substring(i - 1, i);
			}

			if (i < str.length() - word.length() && temp.equals(word)) {
				newString += str.substring(i + word.length(), i + word.length() + 1);
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
