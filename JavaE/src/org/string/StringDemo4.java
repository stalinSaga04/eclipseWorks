package org.string;

public class StringDemo4 {
	public static void main(String[] args) {
		String s = "sivasabari";
		int[] cc = new int[s.length()];
		
		
		for (int j = 0; j < s.length(); j++) {
			int count =1; 
			char ch = s.charAt(j);
		for (int i = j+1; i < s.length(); i++) {
			if (ch==s.charAt(i)) {
				cc[i] =-1;
				count++;
			}
		}
		if (cc[j]!=-1) {
			cc[j] =count;
		}
		if (cc[j] != -1) {
			System.out.println(ch+" number of count is "+cc[j]);
		}
		
		}
	}

}
