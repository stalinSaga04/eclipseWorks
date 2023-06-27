package org.javaLoop;

import java.util.Iterator;

public class StringDemo {
	public static void main(String[] args) {
		StringDemo strdemo= new StringDemo();
		
		
		String s = "#hello*";
//		strdemo.reverse();
		int len = s.length();
		char[] c_array = s.toCharArray() ;
		char[] temp = new char[len];
		
		int i=0,x=c_array.length-1;
		while (i<=x+i) {
			if ((c_array[i]>='a'&&c_array[i]<='z')|| (c_array[i]>='A'&& c_array[i]<='Z')) {
				temp[x]  = c_array[i];
//				System.out.print(temp[x]);
				
			}	
			else {
			c_array[i]= temp[i];
			System.out.println(c_array[i]);
			
			}
			i++;
			x--;
			
		}
		for (int j = 1; j <=temp.length-1; j++) {
			System.out.println(temp[j]);
		}
	}
	
	

}
