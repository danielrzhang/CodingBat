package logic1;

public class SpecialEleven {

	public static boolean specialEleven(int n) {
		if (n % 11 == 0 || (n - 1) % 11 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
