package logic1;

public class TwoAsOne {

	public static boolean twoAsOne(int a, int b, int c) {
		if (a + b == c || b + c == a || c + a == b) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
