package logic1;

public class NearTen {

	public static boolean nearTen(int num) {
		if ((num - 2) % 10 == 0 || (num - 1) % 10 == 0 || num % 10 == 0 || (num + 1) % 10 == 0 || (num + 2) % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
