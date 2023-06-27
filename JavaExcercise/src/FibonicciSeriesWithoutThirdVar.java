package org.loopExcercise;

public class FibonicciSeriesWithoutThirdVar {
	public static void main(String[] args) {
		int count = 10, n1 = 0, n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		FibonicciSeriesWithoutThirdVar f = new FibonicciSeriesWithoutThirdVar();
		f.with_out_variable(n1, n2, count);
		f.with_variable(n1, n2, count);
	}

	private void with_out_variable(int n1, int n2, int count) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			n1 = n1 + n2;
			n2 = n2 + n1;
			System.out.print(n1);
			System.out.println(n2);
		}
		//System.out.println();
	}

	private void with_variable(int n1, int n2, int count) {
		// TODO Auto-generated method stub
		count=20;
		for (int i = 0; i < count; i++) {
			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
