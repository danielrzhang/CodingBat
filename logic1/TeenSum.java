package logic1;

public class TeenSum {

	public static int teenSum(int a, int b) {
		if (((a >= 13) && (a <= 19)) || ((b >= 13) && (b <= 19))) {
			return 19;
		} else {
			return a + b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
