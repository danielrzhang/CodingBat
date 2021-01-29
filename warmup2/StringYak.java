package warmup2;

public class StringYak {

	public static String stringYak(String str) {
		return str.replace("yak", "");
	}

	public static void main(String[] args) {
		System.out.println(stringYak("yakpak"));
		System.out.println(stringYak("pakyak"));
		System.out.println(stringYak("yak123ya"));
	}

}
