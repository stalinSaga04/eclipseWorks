package org.string;

public class StringDemo3 {
	public static void main(String[] args) {
		StringDemo3 sd3 = new StringDemo3();
		sd3.sub_string();
		boolean letter_came = false;
		String name = "   amal raj";
		String name2 = "";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			char letter = charArray[i];
			if (letter == ' ' && letter_came == false) {

			} else {
				letter_came = true;
				name2 = name2 + letter;
				// System.out.print(name2);

			}
		}
		System.out.print(name2);
	}

	private void sub_string() {
		// TODO Auto-generated method stub
		String s1 = "i am the looser but not the quitter";
		String s2 = "";
		String substring = s1.substring(9);
		System.out.print(substring);
		/*
		 * for (int i = 0; i < s1.length(); i++) {
		 * 
		 * s2 = s2+substring;
		 * 
		 * } System.out.print(s2);
		 */
	}
}
