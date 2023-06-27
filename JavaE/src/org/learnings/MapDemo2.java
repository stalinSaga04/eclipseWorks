package org.learnings;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo2 {
	
	public static void main(String[] args) {
		String name  = "sivaramakrishnan";
		int object = 0;
		HashMap map = new HashMap();
		int cnt=0;
		for (int i = 0; i < name.length(); i++) {
			if (map.containsKey(name.charAt(i))) {
				 object = (Integer)map.get(name.charAt(i));
				map.put(name.charAt(i), object+1);
			}
			else {
				map.put(name.charAt(i), object);
			}	
		}
		
		for (Object string  :map.entrySet()) {
//			Iterator i = string.hasNext();
			System.out.println(string);
		}
		
		
	}

}
