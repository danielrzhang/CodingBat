package array2;

public class CountEvens {
	public static int countEvens(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
}
