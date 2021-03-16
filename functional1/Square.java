package functional1;

import java.util.List;

public class Square {

	public static List<Integer> square(List<Integer> nums) {
		nums.replaceAll(n -> n * n);
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
