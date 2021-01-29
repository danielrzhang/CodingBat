package logic1;

public class InOrder {

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (!bOk) {
			if (a < b && b < c) {
				return true;
			} else {
				return false;
			}
		} else {
			if (b < c) {
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
