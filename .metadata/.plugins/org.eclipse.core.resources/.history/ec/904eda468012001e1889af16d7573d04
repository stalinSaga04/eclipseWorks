package org.loopExcercise;
import java.util.Scanner;

public class CardVal10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String credit_num = "6082213656001705";	
		int[] a = new int[credit_num.length()];//(4*2)4(0*2)0(0*2)6(0*2)1 (2*2)0(6*2)5(3*2)5(1*2)6 sc.next();
		for (int i = credit_num.length()-1; i>=0; i--) {
			//sum 12 (1+2) 
			int numericValue = Character.getNumericValue(credit_num.charAt(i));
			System.out.println(numericValue);
			int num = Character.getNumericValue(credit_num.charAt(i));
			if (i%2==0) {
				num=num*2;//13-9 18-9
				if (num>9) {
					num=num-9;
				}
				a[i]=num;
			}
			else {
				a[i]= num;
			}
		}
		int sum=0;
		for (int j = 0; j < a.length; j++) {
			sum=sum+a[j];
			
			System.out.print(a[j]);
		}
		System.out.println();
		System.out.println(sum);
		if (sum%10==0) {
			System.out.println("valid card");
		}else {
		System.out.println("not valid card");
		}
	}

}
