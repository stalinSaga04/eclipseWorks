package org.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListDemo4 {
	public static void main(String[] args) {
//		LinkedList al = new LinkedList(); 
//	    al.add(100);
//	    al.add(200);
//	    al.add("Hi");
//	    al.add(true);
//	    
//	    LinkedList al2 = new LinkedList(); 
//	    al2.add("Siva");
//	    al2.add("Stalin");
//	    al2.add("Anjali");
//	    al2.add("priyanka");
//	    
//	    al.addAll(al2);
//	    
//	System.out.println(al.contains("Stalin")); 
//	al.remove(0);
//
		HashMap hm = new HashMap();
		hm.put("dasf", 1);
		hm.put("sf", 2);
		hm.put("af", 3);
		hm.put("daf", 4);
		hm.put("df", 5);
		Set entryset = hm.entrySet();
		Iterator iterator = entryset.iterator();
		while (iterator.hasNext()) {
			Entry e = (Entry) iterator.next();
			String key = (String) e.getKey();
			int val = (int)e.getValue();
			System.out.println("the key is "+key+" and the value is "+val);
			
		}
		}
	
	

}
