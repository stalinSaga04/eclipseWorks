package org.javaLoop;

public class ArmstrongLoopDemo {
	public static void main(String[] args) {
		int num=1643;
		ArmstrongLoopDemo arm_demo = new ArmstrongLoopDemo();
		int count = arm_demo.find_count(num);
		System.out.println(count);
		arm_demo.power(num, count);
		int result =arm_demo.find_armstrng_num(num,count);
		System.out.println(result);
		if (num==result) {
			System.out.println(num+" is an armstrong number ");
		}else {
			System.out.println(num+" is NOT an armstrong number ");
		}
		
	}

	private int find_armstrng_num(int num,int count) {
		// TODO Auto-generated method stub
		int result=0;
		while (num>0) {
			int rem=num%10;
			result = result+power(rem, count);
			num = num/10;
			}
			//count--;
		return result;
		
	}
	private int find_count(int num) {
		int count=0;
		while (num>0) {
			int rem=num%10;
			count=count+1;
			num = num/10;
		}
		return count;
	}
	int power(int rem,int count) {
		int pow=1;
		while (count>0) {
			pow=pow*rem;
			count--;
		}
	return pow;
	}
}
