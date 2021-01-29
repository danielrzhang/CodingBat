package logic1;

public class In1To10 {

	public static boolean in1to10(int n, boolean outsideMode) {
		if (outsideMode) {
			if (n >= 10 || n <= 1) {
				return true;
			} else {
				return false;
			}
		} else {
			if (n >= 1 && n <= 10) {
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
