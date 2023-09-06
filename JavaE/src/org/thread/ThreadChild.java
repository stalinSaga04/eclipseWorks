package org.thread;

public class ThreadChild extends Thread{

	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("i am interrupted");
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("ThreadChild"+i);
		}
	}

}
