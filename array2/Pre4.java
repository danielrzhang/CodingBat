package array2;

public class Pre4 {

	public static int[] pre4(int[] nums) {
		int counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				break;
			} else {
				counter++;
			}
		}
		
		int[] newArray = new int[counter];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = nums[i];
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
