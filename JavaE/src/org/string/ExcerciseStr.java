package org.string;

import java.util.Iterator;

public class ExcerciseStr {
	public static void main(String[] args) {
		ExcerciseStr ob = new ExcerciseStr();
		String s = "stalin sagayaraj";
		String A ="ABC";
		ob.startsWith(s);
		ob.endsWith(s);
		ob.split(s);
		ob.special(A);
		
		
	}

	private void special(String s) {
		// TODO Auto-generated method stub
		for (int i = 0; i <s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (i%2==0) {
					if (i==0) 
						System.out.print("  "+s.charAt(j));
					else
					System.out.print(s.charAt(j)+" ");
				}else
				System.out.print(" "+s.charAt(j));
			}
			System.out.println();
			
		}
	}

	private void split(String s) {
		// TODO Auto-generated method stub
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
	}

	private void endsWith(String s) {
		// TODO Auto-generated method stub
		int length = s.length()-1;
		String	sub = "aj";
		int l2=sub.length()-1;
		boolean b = true;
		for (int i = sub.length()-1; i>=0; i--) {
			if (s.charAt(length)==sub.charAt(i)) {
				length--;
				continue;
			}
			else {
				b=false;
				break;
			}
		}
		if (b) 
			System.out.println(s + " YES ends with "+ sub);
		else 
			System.out.println(s + " NOT ends with "+ sub);
		
		
	}

	private void startsWith(String s) {
		// TODO Auto-generated method stub
		String sub = "stalo";
		boolean b = true;
		for (int i = 0; i < sub.length(); i++) {
			if (s.charAt(i)==sub.charAt(i)) {
				continue;
			}
			else {
				System.out.println(s+" not start with "+sub);
				b= false;
			}
		}
		if (b) {
			System.out.println(s+" yes starts with "+sub);
		}
		
	}

}
