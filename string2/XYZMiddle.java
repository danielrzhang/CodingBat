package string2;

public class XYZMiddle {

	public static boolean xyzMiddle(String str) {
		if (str.length() < 3) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(xyzMiddle("AAxyzBB"));
		System.out.println(xyzMiddle("AxyzBB"));
		System.out.println(xyzMiddle("AxyzBBB"));

	}
}
