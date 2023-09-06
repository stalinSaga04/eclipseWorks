package Siva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Scanner;

public class StringsDemo{
//	int c1,c2=0;
	public static void main(String[] args) {
		
		
	int[] arr = new int[4];
	ArrayList<Integer> al = new ArrayList<Integer>();
//	String string = "";
//	long result;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the array length");
	int N = sc.nextInt();
	int[] num = new int[N];
//	for (int j = 0; j < arr.length-1; j++) {
//		int n =sc.nextInt();
	
//		arr[0]=5;
//		arr[1]=46;
//		arr[2]=47;
//		arr[3]=45;
//	}
//	for (Integer integer : arr) {
		for (int i = 0; i < N; i++) {
		num[i]=sc.nextInt();
	}
		for (int i : num) {
			al.add(i);
		}
		large(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i));
		}
	}

private static void large(ArrayList<Integer> al) {
	// TODO Auto-generated method stub
Collections.sort(al, new Comparator<Integer>() {
		

		@Override
		public int compare(Integer n1, Integer n2) {
			// TODO Auto-generated method stub
			int f1 = n1;
			int f2=n2;
			int c1=0;
			int c2 =0;
			while(n1>0) {
				
				c1=c1+1;
				n1 /= 10;
		
			}
			while (n2>0) {
				c2=+1;
				n2/=10;
			}
			
			n1=f1;
			n2=f2;
			while(c1>0) {
				c1--;
				f2=f2*10;
			}
			while (c2>0) {
				c2--;
				f1=f1*10;
			}
			f2=f2+n1;
			f1=f1+n2;
//			System.out.println(f2);
//
//			System.out.println(-f1+f2);

			return -f1 + f2;
			
		}
		
	});

	}
}


	
