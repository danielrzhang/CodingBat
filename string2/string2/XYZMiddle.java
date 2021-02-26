package string2;

public class XYZMiddle {

	public static boolean xyzMiddle(String str) {
		if (str.length() < 3) {
			return false;
		}
		
		int start1 = str.length() / 2 - 2;
		int start2 = str.length() / 2 - 1;
		
		if (str.length() % 2 == 0) {
			return str.substring(start1, start1 + 3).equals("xyz") || str.substring(start2, start2 + 3).equals("xyz");
		} else {
			return str.substring(start2, start2 + 3).equals("xyz");
		}
	}

	public static void main(String[] args) {
		System.out.println(xyzMiddle("AAxyzBB"));
		System.out.println(xyzMiddle("AxyzBB"));
		System.out.println(xyzMiddle("AxyzBBB"));

	}
}
