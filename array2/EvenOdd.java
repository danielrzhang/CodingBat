package array2;

public class EvenOdd {

	public static int[] evenOdd(int[] nums) {
		int[] tempArray = new int[nums.length];
		
		for (int i = 0; i < tempArray.length; i++) {
			tempArray[i] = nums[i];
		}
		
		int index = 0;
		
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] % 2 == 0) {
				nums[index] = tempArray[i];
				index++;
			}
		}
		
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] % 2 != 0) {
				nums[index] = tempArray[i];
				index++;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
