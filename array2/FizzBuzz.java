package array2;

public class FizzBuzz {

	public static String[] fizzBuzz(int start, int end) {
		String[] newArray = new String[end - start];
		
		for (int i = start; i < end; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				newArray[i - start] = "Fizz";
			} else if (i % 3 != 0 && i % 5 == 0) {
				newArray[i - start] = "Buzz";
			} else if (i % 3 == 0 && i % 5 == 0) {
				newArray[i - start] = "FizzBuzz";
			} else {
				newArray[i - start] = Integer.toString(i);
			}
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
