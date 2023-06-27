package org.learning;

public class StringManupulation {
	public static void main(String[] args) {
		StringManupulation s = new StringManupulation();
		String email_id = "abcd1234@gmail.com";
		  for(int i=0; i<email_id.length();i++)
		  {
		    char ch = email_id.charAt(i);
		    if(!(ch>='a' && ch<='z') && !(ch>='0' && ch<='9')) 
		      System.out.print(ch);
//		    else if(ch>='0' && ch<='9') {}
//		      //System.out.print(ch);
//		    else
//		      System.out.print(ch);

		  }
	}
}
