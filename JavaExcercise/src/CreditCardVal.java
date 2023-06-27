package org.loopExcercise;

import java.util.Iterator;
import java.util.Scanner;

public class CreditCardVal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many numbera contain in your card  :  ");
		String card_num = sc.next();// 78578978578908
		int[] a = new int[card_num.length()];
		boolean b= false;
		for (int i = a.length-1 ; i >=0; i--) {
			
			int numericValue = Character.getNumericValue(card_num.charAt(i));

			if (b==true) {
				int n = numericValue * 2;
				if (n > 9) {
					n = n - 9;
					a[i] = n;
					b = false;
				} else {
					
					a[i] = n;
					b = true;
				}

//				System.out.print(a[i]+" ");
			} else {
				b=true;
				a[i] = numericValue;
//			System.out.print(a[i]+" ");
			}
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println("the sum is : "+sum);
		int s = sum%10;
		if (s==0) 
			System.out.println("valid card ");
		
		else
			System.out.println("Invalid card ");
		

	}

}
