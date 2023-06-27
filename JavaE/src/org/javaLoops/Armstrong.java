package org.javaLoops;

public class Armstrong {
    public static void main(String[] args) {
    	int actual = 1634;
		Armstrong ar = new Armstrong();
		int count = ar.count_of_digit(actual);
		System.out.println("actual count is : "+count);
		int expect =ar.find_armstrong_numer(actual,count);
		if (actual==expect) {
			System.out.println(actual+" is an armstrong number");
		}else {
			System.out.println(actual+" is NOT an armstrong number");
		}
		
	}

	private int find_armstrong_numer(int num,int count) {
		// TODO Auto-generated method stub
		int rem,copy = 0;
		//int i=0;
		//int orgnl= num; //also save the final num value that is 0
		while (num>0) {
			rem=num%10;
			num=num/10;
			copy =copy+ pow(rem,count);
			
		}
		return copy;
		
	}
	private int pow(int rem,int count) { 
		// TODO Auto-generated method stub
		int result=1;
		while (count>0) {
			
			//int rem = base%10;
			result=rem*result; //4*1 4*4 16*4 64*4=256 3*1 9 27=81 6*1 6*6 36*6 216*6=1296  1*1*1*1=1 256+81+1296+1=1634
			count=count-1; //3 2 1 
		}
		return result;
	}
	public int count_of_digit(int num){
		int count=0,rem;
		while (num>0) {
			rem=num%2;
			count++;
			num=num/10;
		}
		return count;
	}
}
