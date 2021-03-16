package functional2;

import java.util.List;

public class NoNeg {

	public static List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
