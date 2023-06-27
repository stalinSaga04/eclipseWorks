package org.exception;

public class ExceptionDemo2 {
public static void main(String[] args) {
	int[] marks = {98,100,94,95};
	try {
		ErrorDemo.display(marks);	
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("checked an exception");;
	}
		
}
}
