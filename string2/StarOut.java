package string2;

public class StarOut {

	public static String starOut(String str) {
		String newString = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) != '*') {
				newString += Character.toString(str.charAt(i));
			}
			
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
				newString += Character.toString(str.charAt(i));
			}
			
			if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
				newString = newString.substring(0, newString.length() - 1);
			}
		}
		return newString;
	}
	
	public static void main(String[] args) {
		System.out.println(starOut("ab**cd"));
	}

}
