package org.loopExcercise;

public class Pattern11 {
	public static void main(String[] args) {
		int n=5;
		Pattern11 pat= new  Pattern11();
		System.out.println("\n\n1st pattern");
		pat.pat1();
		System.out.println("\n\n  2nd pattern");
		pat.pat2(n);
		System.out.println("\n\n  3rd pattern");
		pat.pat3(n);
		System.out.println("\n\n  4th pattern");
		pat.pat4(n);
		System.out.println("\n\n  5th pattern");
		pat.pat5(n);
		System.out.println("\n\n  6th pattern");
		pat.pat6(n);
	}

	private void pat6(int num) {
		int n = num;
		// TODO Auto-generated method stub
		for (int i = n; i >=1; i--) {
			for (int j = 0; j < i; j++) {
				if (j==0||j==2||j==4) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		
	}

	private void pat5(int num) {
//		int n = num;
		// TODO Auto-generated method stub
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}
	

	private void pat4(int num) {
		int n = num;
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = i-1; j <n ; j++) {  // 4<5   3<5   2<5  1<5 0<5
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	private void pat3(int num) {
		// TODO Auto-generated method stub
		int n = num;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <=i-1 ; j++) {
				System.out.print(" "+" ");
			}
			for (int j = i; j <=n ; j++) { 
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private void pat2(int num) {
		// TODO Auto-generated method stub
		int n = num;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(" "+" ");
			}
			for (int j = n; j >=n-i+1 ; j--) { //  5>=(5-1+1)    4>=(5-2+1) 3  3>=(5-3+1) 2  2>=5-4+1  1>=5-5+1 
				System.out.print(j+" ");		//   5>=5           5>=4     5>=3   5>=2    5>=1        failed
			}
			System.out.println();
		}
	}

	public void pat1( ) {
		// TODO Auto-generated method stub
		int n=1;
		for (int i = 1; i <=5; i++) {
			for (int j = i; j <5 ; j++) {
				System.out.print(" "+" ");
			}
			for (int k =1 ; k<=i ; k++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}

	}

}
