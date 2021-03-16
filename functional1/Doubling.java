package functional1;

import java.util.List;

public class Doubling {

	public static List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
