package array2;

public class ShiftLeft {

	public static int[] shiftLeft(int[] nums) {
		
		int[] newArray = new int[nums.length];
		
		if (nums.length == 0) {
			return newArray;
		}
		
		for (int i = 1; i < nums.length; i++) {
			newArray[i - 1] = nums[i];
		}
		newArray[newArray.length - 1] = nums[0];
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
