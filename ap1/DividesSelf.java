package ap1;

public class DividesSelf {

	public static boolean dividesSelf(int n) {
		int copyN = n;
		int digit;
		
		while (n > 0) {
			digit = n % 10;
			if (digit == 0) {
				return false;
			} else if (copyN % digit != 0) {
				return false;
			} else {
				n /= 10;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
