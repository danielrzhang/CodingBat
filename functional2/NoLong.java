package functional2;

import java.util.List;

public class NoLong {

	public static List<String> noLong(List<String> strings) {
		strings.removeIf(n -> n.length() >= 4);
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
