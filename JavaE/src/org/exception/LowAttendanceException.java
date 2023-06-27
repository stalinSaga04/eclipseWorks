package org.exception;

public class LowAttendanceException extends RuntimeException{
	public LowAttendanceException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}

	public void allowForExams(int attendance) {
		// TODO Auto-generated method stub
//		jvm understood 100/0
//		array index not in minus -5
		if (attendance>75) {
			System.out.println("permit studets");
		}
		else {
			try {
				throw new LowAttendanceException("low attendance");
				
			} catch (LowAttendanceException e) {
				// TODO: handle exception
				System.err.print("low attendance");
			}
			
		}
	}
	

}
