package logic1;

public class BlueTicket {

	public static int blueTicket(int a, int b, int c) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;

		if (ab == 10 || bc == 10 || ac == 10) {
			return 10;
		} else if (ab == bc + 10 || ab == ac + 10) {
			return 5;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
