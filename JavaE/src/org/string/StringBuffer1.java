package org.string;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("sivaramakrishnan");
	    
	    StringBuffer name2 = new StringBuffer(); 
	    for(int i=0; i<name.length();i++)
	    {
	      name2.append(name.charAt(i));
	      System.out.println(name2.hashCode());
	    }
	    System.out.println(name2);
	    StringBuffer reverse = name2.reverse();
	    System.out.println(reverse);
	}


}
