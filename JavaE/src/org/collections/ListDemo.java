package org.collections;

import java.util.ArrayList;

public class ListDemo extends Object {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		boolean add = a.add(40);

		ArrayList b = new ArrayList();
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);

		a.addAll(2, b);
		System.out.println("After adding b " + a);

		ArrayList c = new ArrayList();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c);
		System.out.println(c.contains(600));
		ArrayList al = new ArrayList();
		System.out.println(al.containsAll(b));
		c.add(3,123);
		c.add(0,"ABCD");
		al.add(200);
		al.add(100);
		al.add(300);
		al.add(400);
		
//		System.out.println(al.add(al));
		int[] arr  = {100,101,102,103,104};
		for (Object  val : arr) {
//			System.out.println(val);
			Integer no = (Integer)val;
			if (no%2==0) {
				System.out.println(no);
			}
		}
	}
}
