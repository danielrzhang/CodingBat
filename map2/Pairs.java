package map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {

	public static Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < strings.length; i++) {
			map.put(Character.toString(strings[i].charAt(0)), Character.toString(strings[i].charAt(strings[i].length() - 1)));
		}
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
