package array1;

public class CommonEnd {

	public static boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
