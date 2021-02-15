package recursion1;

public class Array220 {
	public boolean array220(int[] nums, int index) {
		if (index > (nums.length - 2)) {
			return false;
		}

		if (nums[index] * 10 == nums[index + 1]) {
			return true;
		}

		else {
			return array220(nums, index + 1);
		}
	}

}
