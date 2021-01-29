package string1;

public class StartWord {

	public static String startWord(String str, String word) {
		if (str.length() < word.length()) {
			return "";
		}

		String subString = str.substring(1, word.length());
		String subWord = word.substring(1);

		if (subString.equals(subWord)) {
			return str.substring(0, word.length());
		} else {
			return "";
		}
	}

	public static void main(String[] args) {
		startWord("hippo", "hi");
		startWord("hippo", "xip");
		startWord("hippo", "i");
		startWord("hippo", "ix");
	}

}
