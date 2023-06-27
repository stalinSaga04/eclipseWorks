package org.loopExcercise;

import java.util.Scanner;

public class HackRkGP {
	int[] dum_f;
	int[] dum_p;

//	public static long maximumServerRating(int N,int[] P,int[] F,int fr_dif) {
//		return fr_dif;
//		
//	}
//	
	public static void main(String[] args) {
		HackRkGP gp = new HackRkGP();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of computers");
		int N = sc.nextInt();

		int[] P = new int[N];
		int[] F = new int[N];
		System.out.println("enter the power of each computers");
		int i = 0;

		while (N > i) {
			P[i] = sc.nextInt();
//			System.out.print(P[i]);
			i++;
		}
//		System.out.println("the power of each computers are ");
//		for (int j = 0; j < P.length; j++) {
//			System.out.print(P[j]+" ");
//		}
		System.out.println("\nenter frequency of that computer");
		for (int j = 0; j < N; j++) {
			F[j] = sc.nextInt();
//			System.out.print("\n"+ F[i]);
		}
//		for (int j = 0; j < F.length; j++) {
//			System.out.print(F[j]);
////		}
//		int fr_dif=fr_dif(F);
//		System.out.print("the frquency diffrence is "+fr_dif);
//		System.out.println(F[i]);
		gp.choose_computers(P, F);
		System.out.println();

	}

	private int tot_power_of_freqny_of_all_choosedComs(int[] p, int[] f) {
		// TODO Auto-generated method stub
		int tot_power = 0;
		for (int i = 0; i < f.length; i++) {
			tot_power = tot_power +p[i] + f[i] * 2;
		}
		return tot_power;

	}

	private void choose_computers(int[] p, int[] f) {
		// TODO Auto-generated method stub
		int dum_val, tot_power_of_freqny_of_all_choosedComs = 0;
		Scanner sc = new Scanner(System.in);
		dum_p = new int[p.length];
		int[] dum_f = new int[f.length];
		System.out.println("choose any three the computer and note the power also");
		for (int j = 0; j < p.length; j++) {
			System.out.println(p[j] + "  press" + (j));
		}

		for (int i = 0; i < dum_p.length - 1; i++) {
//			System.out.println("choose  " + (i + 1) + " computer");
			dum_val = sc.nextInt();
			if (!(dum_val <= (dum_p.length - 1))) {
				System.out.println("enter/press the correct INPUT");
				dum_val = sc.nextInt();
//				i=i-1;
			}
			dum_p[dum_val] = p[dum_val];
			dum_f[dum_val] = f[dum_val];

		}
		System.out.println("power of choosed computers");
		for (int i = 0; i < dum_p.length; i++) {
//			if (dum_p[i]!= 0) {
			System.out.print(dum_p[i] + " ");
//			}
		}
		System.out.println("\nthe frequency of choosed computers");
		for (int j = 0; j < dum_f.length; j++) {
//			if (dum_f[j] != 0) {
			System.out.print(dum_f[j] + " ");

//			}

			
			
			

		}
		System.out.println();
		tot_power_of_freqny_of_all_choosedComs =tot_power_of_freqny_of_all_choosedComs+ tot_power_of_freqny_of_all_choosedComs(dum_p, dum_f);
		System.out.println(tot_power_of_freqny_of_all_choosedComs);
	}

	private static int fr_dif(int[] f) {
		// TODO Auto-generated method stub
		int coutn = 0;
		for (int i = 0; i <= 0; i++) {
//			coutn =0;
			for (int j = i + 1; j < f.length; j++) {
//				coutn
				if ((f[i] != f[j])) {
					coutn++;
//					break;
				}
			}

		}

		return coutn;
	}
}