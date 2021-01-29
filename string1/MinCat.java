package string1;

public class MinCat {

	public static String minCat(String a, String b) {
		if (a.length() > b.length()) {
			return a.substring(a.length() - b.length()) + b;
		} else if (a.length() < b.length()) {
			return a + b.substring(b.length() - a.length());
		} else {
			return a + b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
