package org.string;

public class StringDemo6 {
	public static void main(String[] args) {
		String str = "I Am Going Now";
		//char [] str1 = new char[str.length()];
		char[] ch1 = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch==' ') {
				str=str+ch;
			}
			else {
				
			}
			
		}
		System.out.print(str);
		
		
	}

}
