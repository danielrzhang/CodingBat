package string2;

public class ZipZap {

	public static String zipZap(String str) {
		if (str.length() < 3) {
			return str;
		} else {
			String newString = "";
			for (int i = 0; i < str.length() - 2; i++) {
				System.out.println(str.substring(i, i + 3));
				System.out.println(str.charAt(i) + " " + str.charAt(i + 2));
				if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
					newString += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 2));
					i += 2;
				} else {
					newString += Character.toString(str.charAt(i));
				}
			}
			return newString;
		}
	}

	public static void main(String[] args) {
		System.out.println(zipZap("zipXzap"));
	}
}
