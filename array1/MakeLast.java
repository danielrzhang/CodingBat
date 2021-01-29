package array1;

public class MakeLast {

	public static int[] makeLast(int[] nums) {
		int[] newNums = new int[nums.length * 2];
		newNums[newNums.length - 1] = nums[nums.length - 1];
		return newNums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
