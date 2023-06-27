package org.collections;

import java.util.LinkedList;

public class ListDemo4 {
	public static void main(String[] args) {
		LinkedList al = new LinkedList(); 
	    al.add(100);
	    al.add(200);
	    al.add("Hi");
	    al.add(true);
	    
	    LinkedList al2 = new LinkedList(); 
	    al2.add("Siva");
	    al2.add("Stalin");
	    al2.add("Anjali");
	    al2.add("priyanka");
	    
	    al.addAll(al2);
	    
	System.out.println(al.contains("Stalin")); 
	al.remove(0);
	}

}
