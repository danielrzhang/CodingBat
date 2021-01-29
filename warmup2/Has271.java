package warmup2;

public class Has271 {

	public static boolean has271(int[] nums) {
		int firstNum, secondNum, thirdNum;
		for (int i = 0; i < nums.length - 2; i++) {
			firstNum = nums[i];
			secondNum = nums[i + 1];
			thirdNum = nums[i + 2];
			if (secondNum == firstNum + 5) {
				if (thirdNum <= firstNum + 1 && thirdNum >= firstNum - 3) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(has271(new int[] { 1, 2, 7, 1 }));
		System.out.println(has271(new int[] { 1, 2, 8, 1 }));
		System.out.println(has271(new int[] { 2, 7, 1 }));
	}

}
