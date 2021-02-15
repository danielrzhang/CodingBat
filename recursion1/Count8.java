package recursion1;

public class Count8 {
	public int count8(int n) {
		if (n == 0) {
			return 0;
		}

		else {
			if (n % 10 == 8) {
				if ((n / 10) % 10 == 8) {
					return 2 + count8(n / 10);
				}
				return 1 + count8(n / 10);
			}

			else {
				return count8(n / 10);
			}
		}
	}

}
