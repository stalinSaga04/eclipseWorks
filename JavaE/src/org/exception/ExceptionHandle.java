package org.exception;

import java.util.Scanner;

public class ExceptionHandle {
	public static void main(String[] args) {
	ExceptionHandle e = new ExceptionHandle();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number1: ");
	int n1 = sc.nextInt();
	System.out.println("enter the number2: ");
	int n2 = sc.nextInt();
	e.divide(n1,n2);
	e.subract(n1,n2);
	}

	private void subract(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println(n1-n2);
	}

	private void divide(int n1, int n2) {
		try {
			System.out.println(n1/n2);
			 int[] ar = new int[n1];
		      System.out.println(ar.length);
		      for(int i=0; i<8;i++)
		      {
		        System.out.println(ar[i]);
		      }
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("check the number");
		}
		catch (ArrayIndexOutOfBoundsException|NegativeArraySizeException e) {
			// TODO: handle exception
			System.out.println("check array index");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("");
		}
		finally {
			//will get executed always irrespective of Exception occurs or not

			  System.out.println("Check me ");
			}
		// TODO Auto-generated method stub
		
	}
}
