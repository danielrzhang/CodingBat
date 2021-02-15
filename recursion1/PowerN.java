package recursion1;

public class PowerN {
	public int powerN(int base, int n) {
		if (n == 0) {
			return 1;
		}

		else {
			return base * powerN(base, n - 1);
		}
	}

}
