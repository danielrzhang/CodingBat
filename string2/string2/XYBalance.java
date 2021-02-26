package string2;

public class XYBalance {

	public static boolean xyBalance(String str) {
		boolean xyBalance = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				xyBalance = false;
			} else if (str.charAt(i) == 'y') {
				xyBalance = true;
			}
		}
		return xyBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
