package functional1;

import java.util.List;

public class Lower {

	public static List<String> lower(List<String> strings) {
		strings.replaceAll(n -> n.toLowerCase());
		return strings;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
