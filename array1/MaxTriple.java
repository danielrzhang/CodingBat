package array1;

public class MaxTriple {

	public static int maxTriple(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];
		int middle = nums[nums.length / 2];

		if (first <= last && middle <= last) {
			return last;
		} else if (middle <= first && last <= first) {
			return first;
		}
		return middle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
