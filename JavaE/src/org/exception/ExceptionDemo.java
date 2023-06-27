package org.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		LowAttendanceException l = new LowAttendanceException("");
//		try {
			l.allowForExams(68);
			//throw l;
//		} catch (LowAttendanceException e) {
			// TODO: handle exception
//			System.out.println("check attendance");
//		}
		
	}
}
