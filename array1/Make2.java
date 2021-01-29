package array1;

public class Make2 {

	public static int[] make2(int[] a, int[] b) {
		int[] newArray = new int[2];
		for (int i = 0; i < 2; i++) {
			if (i < a.length) {
				newArray[i] = a[i];
			} else {
				newArray[i] = b[i - a.length];
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
