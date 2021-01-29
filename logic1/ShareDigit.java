package logic1;

public class ShareDigit {

	public static boolean shareDigit(int a, int b) {
		int aRight = a % 10;
		int aLeft = (a / 10) % 10;
		int bRight = b % 10;
		int bLeft = (b / 10) % 10;

		if (aRight == bRight || aRight == bLeft || aLeft == bRight || aLeft == bLeft) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
