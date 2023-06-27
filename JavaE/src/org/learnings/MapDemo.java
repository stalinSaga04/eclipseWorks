package org.learnings;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {

		TreeMap hm = new TreeMap();
		hm.put("Idli", 20);
		hm.put("Dosai", 30);
		hm.put("Poori", 30);
		hm.put("Pongal", 40);
		hm.put("Dosai", 60);
//		hm.get(hm.toString());

		System.out.println(hm);
		Set keySet = hm.keySet();
		System.out.println(keySet);
		Set entrySet = hm.entrySet();
		Set s = hm.entrySet();
		for (Object ob : s) {
			Entry entry = (Entry) ob;

			String item = (String) entry.getKey();
			if (item.equals("Dosai")) {
				entry.setValue(50);
				System.out.println(entry.getValue());
			}
		}

//    for (Object object : entrySet) {
//    Entry entry = (Entry) object;
////		System.out.println(object);
//    	Integer value = (Integer)entry.getValue();
//    	System.out.println(value);
//	}
		System.out.println(entrySet);
		Collection values = hm.values();
		System.out.println(values);
		System.out.println(hm.containsValue(40));
	}
}
