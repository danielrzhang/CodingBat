package logic1;

public class InOrderEqual {

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (!equalOk) {
			if (a < b && b < c) {
				return true;
			} else {
				return false;
			}
		} else {
			if (a <= b && b <= c) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
