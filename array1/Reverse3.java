package array1;

public class Reverse3 {

	public static int[] reverse3(int[] nums) {
		int temp1 = nums[0];
		int temp2 = nums[2];
		nums[0] = temp2;
		nums[2] = temp1;
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
