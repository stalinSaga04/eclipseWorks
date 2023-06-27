package org.learning;

import java.util.Scanner;

public class ArunKumarPandiChoco {
	public static void main(String[] args) {
		ArunKumarPandiChoco ap = new ArunKumarPandiChoco();
		boolean res=false;
		
		//		int totalChoco= 7;
//        int totalWrap= totalChoco;
//
//        while (totalWrap >= 3)
//        {
//            int freeChoco = totalWrap / 3;
//            totalChoco = freeChoco + totalChoco;
//            totalWrap= totalWrap % 3;
//            totalWrap= totalWrap + freeChoco;
//        }
//        System.out.println(totalChoco);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first line and secondline");
//		System.out.println("enter the string length");
		int s1 = sc.nextInt();
		String s = sc.nextLine();
//		String string = sc.nextLine();
		for (int i = 0; i < s1; i++) {
			s = sc.nextLine();
		}
		System.out.println("the lines are "+s.length());
		
			try {
				int val = Integer.parseInt(s);
				System.out.println(val*2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(s);
			}
			
			
		
		
	
	}

}
