package array1;

public class Front11 {

	public static int[] front11(int[] a, int[] b) {
		if (a.length == 0 && b.length == 0) {
			return new int[] {};
		} else if (a.length != 0 && b.length == 0) {
			return new int[] {a[0]};
		} else if (a.length == 0 && b.length != 0) {
			return new int[] {b[0]};
		} else {
			return new int[] {a[0], b[0]};
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
