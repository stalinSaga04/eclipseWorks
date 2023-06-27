package org.loopExcercise;

public class ExcerciseLoop1 {
	public static void main(String[] args) {
		int num = 15, j = 1;
		for (int i = 1; i <= num; i++) {
			// System.out.print(1);
			// System.out.print(i);
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		while (j <= num) {
			if (j % 3 == 0) {
				System.out.print(j + " ");
			}
			j++;
		}
		

	}
}
