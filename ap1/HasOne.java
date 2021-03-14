package ap1;

public class HasOne {

	public static boolean hasOne(int n) {
		int digit;
		while (n > 0) {
			digit = n % 10;
			if (digit == 1) {
				return true;
			} else {
				n /= 10;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
