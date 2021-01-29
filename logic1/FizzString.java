package logic1;

public class FizzString {

	public static String fizzString(String str) {
		if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
			return "FizzBuzz";
		} else if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) != 'b') {
			return "Fizz";
		} else if (str.charAt(0) != 'f' && str.charAt(str.length() - 1) == 'b') {
			return "Buzz";
		} else {
			return str;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
