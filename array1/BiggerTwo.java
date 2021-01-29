package array1;

public class BiggerTwo {

	public static int[] biggerTwo(int[] a, int[] b) {
		int sumOne = 0;
		int sumTwo = 0;
		for (int i = 0; i < 2; i++) {
			sumOne += a[i];
			sumTwo += b[i];
		}

		if (sumOne >= sumTwo) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
