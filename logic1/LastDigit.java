package logic1;

public class LastDigit {

	public static boolean lastDigit(int a, int b, int c) {
		a = a % 10;
		b = b % 10;
		c = c % 10;

		if ((a == b && b == c && c == a) || (a == b) || (b == c) || (c == a)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
