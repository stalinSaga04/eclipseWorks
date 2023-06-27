package org.javaLoop;

public class Excercise {
	public static void main(String[] args) {
		Excercise e = new Excercise();
		int pow=e.find(4,4);
		System.out.println(pow);
		
	}

	private int find(int rem, int count) {
		// TODO Auto-generated method stub
		int pow = 1;
		while (count>0) {
			pow = pow*rem;
			count--;
		}
		return pow;
	}

}
