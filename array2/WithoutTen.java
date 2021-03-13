package array2;

import java.util.Arrays;

public class WithoutTen {

	public static int[] withoutTen(int[] nums) {
		int[] tempArray = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			tempArray[i] = nums[i];
			nums[i] = 0;
		}
		
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (tempArray[i] != 10) {
				nums[index] = tempArray[i];
				index++;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(withoutTen(new int[] {1, 99, 10})));
	}

}
