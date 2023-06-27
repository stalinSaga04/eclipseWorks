package org.loopExcercise;

import java.util.Scanner;

public class PrimeNumebr {
	public static void main(String[] args) {
		PrimeNumebr pn = new PrimeNumebr();
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the numer to find the prime numebr upto that number ");
		int num = sc.nextInt();
		
		//pn.prime(num);
		pn.prime_numers(num);
	}

	private void prime_numers(int n) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <i; j++) {
				if (i%j==0) {
					count++;
					break;
				}else {
					count=0;
				}
			}
			if (count==0) {
				System.out.println(i +" is a prime ");
			}
		}
		
		
		
	}

	private void prime(int number) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 2; i < number/2; i++) {
			if (number%i==0) {
				count++;
				break;
			}
			
		}
		if (count==0) {
			System.out.println(number+" is a prime");
		}else {
			System.out.println(number+ " is not a prime number");
		}
	}

}
