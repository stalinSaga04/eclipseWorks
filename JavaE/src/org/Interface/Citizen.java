package org.Interface;

public class Citizen extends Parent implements Govt,Zoho,StateGovt{
	public static void main(String[] args) {
		Citizen c1 = new Citizen();
		c1.watch_movies();
		System.out.println(Govt.fine_for_helmet);
	}

	@Override
	public void change2000Rupees() {
		// 8
	System.out.println("money");
	}

	@Override
	public void displayIDProof() {
		// TODO Auto-generated method stub
		System.out.println("Id proof");
	}

	@Override
	public void displayAddressProof() {
		// TODO Auto-generated method stub
		System.out.println("address proof");
	}

	@Override
	public void wearHelmet() {
		// TODO Auto-generated method stub
		System.out.println("wear helmet");
	}
	public void watch_movies() {
		// TODO Auto-generated method stub
		System.out.println("watching movies");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("study");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("work");
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("developer");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("tester");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("update");
	}

	@Override
	public void provide_electricty() {
		// TODO Auto-generated method stub
		System.out.println("electricty ");
	}

	@Override
	public void lay_roads() {
		// TODO Auto-generated method stub
		
	}

	
}
