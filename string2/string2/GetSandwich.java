package string2;

public class GetSandwich {

	public static String getSandwich(String str) {
		int first = str.indexOf("bread");
		int last = str.lastIndexOf("bread");
		if (first == last) {
			return "";
		} else {
			return str.substring(first + 5, last);
		}
	}

	public static void main(String[] args) {
		System.out.println(getSandwich("xxbreadbreadjambreadyy"));
	}

}
