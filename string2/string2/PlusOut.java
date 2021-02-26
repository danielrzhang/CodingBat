package string2;

public class PlusOut {

	public static String plusOut(String str, String word) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if (i <= str.length() - word.length()) {
				if (str.substring(i, i + word.length()).equals(word)) {
					newString += str.substring(i, i + word.length());
					if (i < str.length()) {
						i += word.length() - 1;
					}
				} else {
					newString += "+";
				}
			} else {
				newString += "+";
			}
		}
		return newString;
	}
	
	public static void main(String[] args) {
		System.out.println(plusOut("abXYabcXYZ", "abc"));
	}

}
