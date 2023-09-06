package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
//		String input = "My mobile number is 9884010000@gmail.com";
		String s = "Chennai is the capital city of Tamilnadu";
		String mo="9840950950";
		String e="10-jul-2023";
		Pattern p = Pattern.compile(e);
		Pattern patternObj = Pattern.compile("(0|91)?[0-9]{10}");
				//+ "// "[a-zA-Z0-9$]" "//s" -space "//s"-neglect space 
//	    Pattern patternObj = Pattern.compile("[0-9]");//"\\d{10}");
		Matcher matcherObj = patternObj.matcher(mo);
		int count = 0;
		while (matcherObj.find()) {
//			count++;
			System.out.println(matcherObj.group());

//	      System.out.println(matcherObj.start());
//	      System.out.println(matcherObj.end());
		}
//		System.out.println(count);
	}

}