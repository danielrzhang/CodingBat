package logic1;

public class Old35 {

	public static boolean old35(int n) {
		if ((n % 3 == 0 || n % 5 == 0) && n % 15 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
