package org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet hs = new  HashSet();
		
		hs.add("mugilan");
		hs.add("praveen");
		hs.add("prabha");
		hs.add("mugil");
		hs.add("mugilan");
		System.out.println(hs);
		HashSet hs2  = new HashSet();
		hs2.addAll(hs);
	boolean remove = hs.remove("Praveen");
	System.out.println(remove);
		System.out.println(hs);
		LinkedHashSet lsh = new LinkedHashSet();
		lsh.addAll(hs);
		System.out.println(lsh);
		
		
	}

}
