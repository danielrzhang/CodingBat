package logic1;

public class MaxMod5 {

	public static int maxMod5(int a, int b) {
		if (a == b) {
			return 0;
		} else if (a % 5 == b % 5) {
			return Math.min(a, b);
		} else {
			return Math.max(a, b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
