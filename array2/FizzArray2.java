package array2;

public class FizzArray2 {

	public static String[] fizzArray2(int n) {
		String[] newArray = new String[n];
		
		for (int i = 0; i < n; i++) {
			newArray[i] = Integer.toString(i);
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
