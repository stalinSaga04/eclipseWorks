package org.learning;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); //Array list of integer objects
	    al.add(10);
	    al.add(20);
	    al.add(30);
//	    al.add('v');
//	    al.add(true);
	    ArrayListDemo2 ald = new ArrayListDemo2(); 
	    ald.add_All_items(al);
	    HashMap< String, Integer> hm = new HashMap<String,Integer>();
	    hm.put("fsdf",al.get(0));
	}

	private void add_All_items(ArrayList al) {
		// TODO Auto-generated method stub
		int total = 0;
		for (Object object : al) {
			total = total+ (int)object;
		}
		System.out.println(total);
	}

}
