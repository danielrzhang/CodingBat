package recursion1;

public class SumDigits {
	public int sumDigits(int n) {
		if (n == 0) {
			return 0;
		}

		else {
			return (n % 10) + sumDigits(n / 10);
		}
	}

}
