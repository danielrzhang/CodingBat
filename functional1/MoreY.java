package functional1;

import java.util.List;

public class MoreY {

	public static List<String> moreY(List<String> strings) {
		strings.replaceAll(n -> "y" + n + "y");
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
