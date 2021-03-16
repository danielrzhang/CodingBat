package functional2;

import java.util.List;

public class NoTeen {

	public static List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(n -> n >= 13 && n <= 19);
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
