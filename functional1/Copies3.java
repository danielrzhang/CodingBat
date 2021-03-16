package functional1;

import java.util.List;

public class Copies3 {

	public static List<String> copies3(List<String> strings) {
		strings.replaceAll(n -> n + n + n);
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
