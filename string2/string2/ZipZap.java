package string2;

public class ZipZap {

	public static String zipZap(String str) {
		String newString = "";
		
		if (str.length() < 3) {
			return str;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
					newString += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 2));
					i += 2;
				} else {
					newString += Character.toString(str.charAt(i));
				}
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(zipZap("zip"));
	}
}
