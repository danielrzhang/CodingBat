package array2;

public class FizzArray3 {

	public static int[] fizzArray3(int start, int end) {
		int[] newArray = new int[end - start];
		
		for (int i = start; i < end; i++) {
			newArray[i - start] = i;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
