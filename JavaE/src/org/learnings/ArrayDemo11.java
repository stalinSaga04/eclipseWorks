package org.learnings;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo11 {
	public static void main(String[] args) {
		Mobiles m1 = new Mobiles(10000, 4, 6.5f, "Samsung");
		Mobiles m2 = new Mobiles(8000, 2, 4.5f, "Oppo");
		Mobiles m3 = new Mobiles(12000, 4, 5f, "Vivo");
		Mobiles m4 = new Mobiles(9000, 6, 6f, "Apple");
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al1.add(al);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
//		Comparable c = (Comparable) al;
//		int compareTo = c.compareTo(al1);
//		System.out.println(compareTo);
		
	}

}
