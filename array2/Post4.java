package array2;

public class Post4 {

	public static int[] post4(int[] nums) {
		int counter = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4) {
				break;
			} else {
				counter++;
			}	
		}
		
		int[] newArray = new int[counter];
		
		for (int i = nums.length - counter; i < nums.length; i++) {
			newArray[i + counter - nums.length] = nums[i];
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
