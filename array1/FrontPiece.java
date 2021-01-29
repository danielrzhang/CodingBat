package array1;

public class FrontPiece {

	public static int[] frontPiece(int[] nums) {
		if (nums.length < 2) {
			return nums;
		} else {
			return new int[] {nums[0], nums[1]};
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
