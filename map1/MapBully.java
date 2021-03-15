package map1;

import java.util.Map;

public class MapBully {

	public static Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}

		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
