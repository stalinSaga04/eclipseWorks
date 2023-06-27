package org.exception;

public class ErrorDemo {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NegativeArraySizeException, Exception {
	    // TODO Auto-generated method stub
	int[] marks = {100,90,97, 96, 92};
	display(marks);
	//disply1(marks);

	  }

		/*
		 * private static void //disply1(int[] marks) { // TODO Auto-generated method
		 * stub
		 * 
		 * }
		 */
	public static void display(int[] ar) throws ArrayIndexOutOfBoundsException ,NegativeArraySizeException,Exception{
	    int total = 0; 
	    for(int i=0; i<5;i++)
	    {
	      total = total + ar[i];
	    }
	    
	  System.out.println("total "+ total);
	  }
}
