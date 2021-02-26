package string2;

public class OneTwo {

	public static String oneTwo(String str) {
		String newString = "";
		String letterToShift = "";
		int counter = 0;

		if (str.length() < 3) {
			return "";
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (counter >= str.length() / 3) {
					break;
				}
				
				if (i % 3 == 0) {
					letterToShift = Character.toString(str.charAt(i));
				}

				if ((i + 1) % 3 == 0) {
					newString += Character.toString(str.charAt(i)) + letterToShift;
					counter++;
				} else if (i % 3 != 0){
					newString += Character.toString(str.charAt(i));
				}
			}
		}
		return newString;	
	}

	public static void main(String[] args) {
		System.out.println(oneTwo("1234567890"));
	}
}
