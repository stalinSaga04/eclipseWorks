package org.loopExcercise;

import java.util.Scanner;

public class MulOf3And5 {
	public static void main(String[] args) {
		MulOf3And5 mul=new MulOf3And5();
		mul.mul_3_and_5();
		mul.mul_3_or_5();
		
	}

	private void mul_3_or_5() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numer to print multiples of 3 OR 5 upto that number ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i%3==0 || i%5==0) {
				System.out.print(i+" ");
			}
		}
		

	}

	private void mul_3_and_5() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\nenter the numer to print multiples of 3 AND 5 upto that number ");
		int num = sc.nextInt();
		int i =1;
		while (i<=num) {
			if (i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		
		
	}

}
