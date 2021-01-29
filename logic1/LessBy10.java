package logic1;

public class LessBy10 {

	public static boolean lessBy10(int a, int b, int c) {
		if (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
