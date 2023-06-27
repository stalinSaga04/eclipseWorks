package org.loopExcercise;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Digits digit = new Digits();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the digit to find count of digit");
		int num = sc.nextInt();
		digit.count_of_digits(num);
		int sum = digit.sum_of_digits(num);
		System.out.println("the sum is "+sum);
	}

	private int sum_of_digits(int num1) {
		// TODO Auto-generated method stub
		int sum =0,rem;
		for (int i = 0; i <= num1; i++) {
			rem=num1%10;
			sum=sum+rem;
			num1=num1/10;
		}
		return sum;
	}

	private void count_of_digits(int num2) {
		// TODO Auto-generated method stub
		int count =0;
		for (int i = 0; i <= num2; i++) {
			count++;
			num2=num2/10;
			
		}
		System.out.println(count);
		
	}

}
