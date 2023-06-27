package org.loopExcercise;

import java.util.Scanner;

public class DivisorOfGivenNum {
	public static void main(String[] args) {
		DivisorOfGivenNum div =new DivisorOfGivenNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numer to find its divisors: ");
		int num = sc.nextInt();
		div.div_of_given_num(num);
	}

	private void div_of_given_num(int num) {
		// TODO Auto-generated method stub
		int i =1, count=0;
		while (i<=num) {
			if (num%i==0) {
				System.out.print(i+" ");
				count++;
			}
			i++;
			
		}
		System.out.println("\n100counts of the divisor is "+count);
	}

}
