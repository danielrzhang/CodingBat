package array2;

public class TenRun {

	public static int[] tenRun(int[] nums) {
		if (nums.length == 0) {
			return nums;
		}
		
		int currentNum = nums[0];
		boolean encounterTen = false;		
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				currentNum = nums[i];
				encounterTen = true;
			} else {
				if (encounterTen) {
					nums[i] = currentNum;
				}
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
