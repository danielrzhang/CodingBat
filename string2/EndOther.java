package string2;

public class EndOther {

	public static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.endsWith(b) || b.endsWith(a)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
