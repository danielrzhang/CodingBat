package array2;

public class TripleUp {

	public static boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
