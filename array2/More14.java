package array2;

public class More14 {

	public static boolean more14(int[] nums) {
		int oneCounter = 0;
		int fourCounter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				oneCounter++;
			} else if (nums[i] == 4) {
				fourCounter++;
			}
		}
		
		return oneCounter > fourCounter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
