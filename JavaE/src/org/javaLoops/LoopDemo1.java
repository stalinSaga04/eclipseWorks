package org.javaLoops;

import java.util.Scanner;

public class LoopDemo1 {
	public static void main(String[] args) {
		LoopDemo1 lp = new LoopDemo1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.next();//"*Fds*ug.";
		char[] num = s.toCharArray();
		System.out.println("");
		//System.out.prifntln("original string : "+s);
		char[] rev =lp.reverse(num);
		String reverse = new String(rev);
		System.out.println("reverse:  "+reverse);
		
	}
	private char[] reverse(char num[]) {

		char[] temp = new char[num.length-1];
		int i = 0, j = temp.length
				;
		while (i <j) {
			if (!(num[i] >= 'a' && num[i] <= 'z' || num[i] >= 'A' && num[i] <= 'Z')) 
			{
				i++; 
			}		
			else if (!(num[j] >= 'a' && num[j] <= 'z' || num[j] >= 'A' && num[j] <= 'Z')) {
				
				j--;  
			}
			else {
				char ch =num[i]; 
				num[i] = num[j];
				num[j] = ch;     
				i++; 
				j--;
			}
		}
		//System.out.println(num);
		return num;
	}
}
	/*private void rev(char[] num, String s) {
		// TODO Auto-generated method stub
		int sl = s.length();
		int i = 1;
		while (i <= (sl - 1) / 2) {
			char ch = num[i];
			num[i] = num[sl - 1 - i];
			num[sl - 1 - i] = ch;
			System.out.println(num[i]);
			i++;

		}
		System.out.println(num);*/
	


