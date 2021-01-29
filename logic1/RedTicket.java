package logic1;

public class RedTicket {

	public static int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2) {
			return 10;
		} else if (a == b && b == c && c == a) {
			return 5;
		} else if (a != b && a != c) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
