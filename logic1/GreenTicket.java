package logic1;

public class GreenTicket {

	public static int greenTicket(int a, int b, int c) {
		if (a == b && b == c && c == a) {
			return 20;
		} else if (a == b || b == c || c == a){
			return 10;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
