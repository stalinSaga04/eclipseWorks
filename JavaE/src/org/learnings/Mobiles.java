package org.learnings;

public class Mobiles implements Comparable {
	public Mobiles(int price, int ram, float screensize, String brand) {
		// TODO Auto-generated constructor stub
		super();
	    this.price = price;
	    this.ram = ram;
	    this.screensize = screensize;
	    this.brand = brand;
	}

	int price, ram;
	float screensize;
	String brand;
	public String toString()
	  {
	    return this.brand+" "+this.price;
	  }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
	Mobiles mob2 = (Mobiles) this;
	Mobiles mob1 = (Mobiles)o;
	
	String s = mob2.brand;
	String s2 = mob1.brand;
	if (mob2.price > mob1.price) {
		return 123;
	}
	else if (mob2.price>mob1.price) {
		return -100;
		
	}
		return 0;
	}
}
