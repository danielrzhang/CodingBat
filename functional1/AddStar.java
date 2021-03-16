package functional1;

import java.util.List;

public class AddStar {

	public static List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
