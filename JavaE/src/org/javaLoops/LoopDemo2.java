package org.javaLoops;

import java.util.Iterator;

public class LoopDemo2 {
	public static void main(String[] args) {
		LoopDemo2 lp2 = new LoopDemo2();
		String s = "sjf@&)*saja";
		char[] str = s.toCharArray();
		char[] temp = lp2.find_reverse(str);
		String dummy = new String(temp);
		System.out.println(dummy);
		// lp2.find_reverse1(str,temp);
	}

	/*
	 * private void find_reverse1(char[] str, char[] temp) { // TODO Auto-generated
	 * method stub int len = str.length,i=0; while (i<len) { if (condition) {
	 * 
	 * } }
	 */

	private char[] find_reverse(char[] str) {
		// TODO Auto-generated method stub
		char[] temp = new char[str.length];
		int i = 0,x=temp.length-1;
		while (i <x) {
			
			  if(!(str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z')) {
				  str[i]=temp[i];
				  i++;
			  }else if(!(str[x] >= 'a' && str[x] <= 'z' || str[x] >= 'A' && str[x] <= 'Z')){
					
				  temp [i] =str [i]; 
			  }
				 
			  char ch = str[i];
				str[i] = str[x-i];
				str[x-i]=ch;
				i++;
			  
			x--;
		}
		return str;
	}

}
