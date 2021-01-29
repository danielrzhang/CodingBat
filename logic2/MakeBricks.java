package logic2;

public class MakeBricks {

	public static boolean makeBricks(int small, int big, int goal) {
		int numBig = goal / 5;
		int numSmall = goal % 5;

		System.out.println(numBig + " " + numSmall);
		if (numSmall <= small && numBig <= big) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(makeBricks(3, 1, 9));
	}

}
