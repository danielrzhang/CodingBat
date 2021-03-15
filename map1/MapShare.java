package map1;

import java.util.Map;

public class MapShare {

	public static Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("c")) {
			map.remove("c");
		}
		
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
