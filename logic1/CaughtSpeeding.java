package logic1;

public class CaughtSpeeding {

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		int factor;
		if (isBirthday) {
			factor = 5;
		} else {
			factor = 0;
		}

		if (speed <= 60 + factor) {
			return 0;
		} else if (speed >= 61 + factor && speed <= 80 + factor) {
			return 1;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
