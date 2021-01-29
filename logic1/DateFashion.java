package logic1;

public class DateFashion {

	public static int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			return 0;
		} else if (you >= 8 || date >= 8) {
			return 2;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
