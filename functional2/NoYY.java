package functional2;

import java.util.List;

public class NoYY {

	public static List<String> noYY(List<String> strings) {
		strings.replaceAll(n -> n + "y");
		strings.removeIf(n -> (n.contains("yy")));
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
