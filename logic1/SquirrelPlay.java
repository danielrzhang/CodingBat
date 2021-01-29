package logic1;

public class SquirrelPlay {

	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer) {
			if (temp >= 60 && temp <= 100) {
				return true;
			} else {
				return false;
			}
		} else {
			if (temp >= 60 && temp <= 90) {
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
