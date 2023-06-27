package org.loopExcercise;
import java.util.Scanner;
public class CardValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter card number");
		String card_number=sc.next();	
		isvalidCard(card_number);
		
	}
//	private static void card_number(int digit) {
//	
//		// TODO Auto-generated method stub
//		int i = 0;
//		final int[] card_num = new int[digit];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter card number ");
//		while (digit>i) {
//		card_num[i]=sc.nextInt();
//			i++;
//		}
//		for (int j = 1; j < card_num.length; j++) {
//			System.out.print(card_num[j]);
//		}	
//	}
	private static void isvalidCard(String card_number) {
		// TODO Auto-generated method stub
		for (int i = 0; i < card_number.length(); i++) {
			int indexOf = Character.getNumericValue(card_number.charAt(i));
			System.out.println(indexOf);
		}
		
	}
}
