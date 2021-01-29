package logic1;

public class SumLimit {

	public static int sumLimit(int a, int b) {
		String strA = Integer.toString(a);
		String sum = Integer.toString(a + b);

		if (strA.length() == sum.length()) {
			return a + b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
