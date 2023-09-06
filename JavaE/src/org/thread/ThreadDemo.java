package org.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadChild tc = new ThreadChild();
		tc.start();
		System.out.println(tc.getState());
		ThreadChild tc2 = new ThreadChild();
		tc2.start();
		tc.setPriority(2);
		
			tc2.interrupt();
			tc2.interrupted();
		
		System.out.println(tc.getState());
		for (int i = 1; i <= 5; i++) {
			System.out.println("ThreadDemo"+i);
		}
		
	}
}
