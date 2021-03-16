package functional1;

import java.util.List;

public class NoX {

	public static List<String> noX(List<String> strings) {
		strings.replaceAll(n -> n.replace("x", ""));
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
