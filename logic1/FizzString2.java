package logic1;

public class FizzString2 {

	public static String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz!";
		} else if (n % 3 == 0 && n % 5 != 0) {
			return "Fizz!";
		} else if (n % 3 != 0 && n % 5 == 0) {
			return "Buzz!";
		} else {
			return n + "!";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
