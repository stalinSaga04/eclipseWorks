package org.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(false);
		al.add(103);
		al.add(20.9f);
		al.add(101);
		System.out.println(al);
		for (Object ob : al) {
			try {
				Integer no = (Integer) ob;
				System.out.println(no);
			} catch (ClassCastException cce) {

			}
			ArrayList bl = new ArrayList();
			bl.add(50);
			bl.add('K');
			bl.add(70);
			bl.add("flask");

			al.addAll(bl);
			System.out.println(al);
			al.retainAll(bl);
			System.out.println(al);
			List c =al.subList(0, 2);
			

		}
	}
}