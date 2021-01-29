package warmup2;

public class StringX {

	public static String stringX(String str) {

		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) != 'x') || (i == 0 || i == str.length() - 1)) {
				newString += str.charAt(i);
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		stringX("xxHxix");
		stringX("abxxxcd");
		stringX("xabxxxcdx");
	}
}
