package org.thread;

public class ThreadDemo2 {
	public static void main(String[] args) {
		ThreadChild2 tc = new ThreadChild2();
		tc.start();
		ThreadChild2 tc1 = new ThreadChild2();
		tc1.start();
		for (int i = 0; i <=5; i++) {
			
			System.out.println("TD");
		}
	}

}
