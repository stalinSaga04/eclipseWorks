package org.learning;

import java.util.Scanner;

public class Choco {

	public static void main(String[] args) {
		Choco s = new Choco();
		Scanner sc = new Scanner(System.in);
		System.out.println("1 choco for every 3 chco papper  ");
		System.out.println("enter how many choc you want: ");
		int choc = sc.nextInt();
		s.choc(choc);
	}
	private void choc(int choc2) {
		// TODO Auto-generated method stub
		int choc = choc2,initial_choc=choc, tot = 0, rem =0,new_choc=0;
		int ext_choc = 0;
		
			while (choc>=3) {
				rem = choc % 3;    
				new_choc = choc / 3;
				
				ext_choc=+new_choc;
				if (new_choc!=0) {
					tot =tot+ ext_choc;
					choc=new_choc+rem; // getting remaining choclates or covers
				}
			}
			
			
			System.out.println("total eaten choclates "+(initial_choc+tot));
			System.out.println("balance choclate cover:  "+choc);
		}
	
}