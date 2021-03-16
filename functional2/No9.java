package functional2;

import java.util.List;

public class No9 {

	public static List<Integer> no9(List<Integer> nums) {
		nums.removeIf(n -> n % 10 == 9);
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
