package logic1;

public class TeaParty {

	public static int teaParty(int tea, int candy) {
		if (tea >= 5 && candy >= 5) {
			if (tea >= candy * 2 || candy == tea * 2) {
				return 2;
			} else {
				return 1;
			}
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
