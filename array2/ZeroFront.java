package array2;

import java.util.Arrays;

public class ZeroFront {

	public static int[] zeroFront(int[] nums) {
		int[] tempArray = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			tempArray[i] = nums[i];
			nums[i] = 0;
		}
		
		int index = nums.length - 1;
		
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] != 0) {
				nums[index] = tempArray[i];
				index--;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(zeroFront(new int[] {0, 1, 2, 0, 3})));
	}

}
