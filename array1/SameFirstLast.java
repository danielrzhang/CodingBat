package array1;

public class SameFirstLast {

	public static boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
