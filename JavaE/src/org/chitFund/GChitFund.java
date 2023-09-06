package org.chitFund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class GChitFund implements DiscountPrice {
	String cus_name, state, email;
	long phone_num;
	static HashMap ring_cat = new HashMap();;
//	static HashMap chain_cat = new HashMap();
	static HashMap bracelets_cat = new HashMap();
	static HashMap Earings_cat = new HashMap();
	static HashMap c_cat = new HashMap();
	

	public GChitFund() {
		// TODO Auto-generated constructor stub
		System.out.println("Hi!, Welcome To InCh CHIT ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer LOG IN Pannel");
		System.out.println("enter your name: ");
		this.cus_name = "saga";// sc.nextLine();
		System.out.println("enter your state");
		this.state = "tamilnadu";// sc.nextLine();
		System.out.println("enter your email");
		this.email = "aed@gmail.coom";// sc.nextLine();
		System.out.println("enter your phone number");
		this.phone_num = 9840950950l;// sc.nextLong();

	}

//	public GChitFund(String cus_name, String state, String email, double ph_no) {
//
//	}

	static private void gold_Scheme_review() {
		// TODO Auto-generated method stub
		String[] c_cat_models = { "Gold Ball 18", "Ananda 18", "The fame 18", "Ananda 21", "The fame 24",
				"Square chains\n 24'inch", "Square chains\n24'inch (20)" };
		String[] ring_cat_models = { "Blossom Ring 14mm", "Classic Leaf\n  Ring 14mm\t", "Crescent Ring 14mm", "CrisCross Ring 14mm", "Flower Ring 14mm",
				"Sun Flower Ring 14mm", "Twirl Ring 14mm","Line Ring 14mm","blossom Ring 16mm","Classic Leaf\n  Ring 16mm\t","Elite\n  Design Ring 14mm" ,"Designer Ring 14mm","Flower Ring 16mm","oval Ring 16mm","Zigzag Ring 16mm"};
		String[] brac_cat= {"Elegant Bracelet","Charming Bracelet","Infinity Gold Bracelet","Box Bracelet","Curb Bracelet","Classy Bold Bracelet","Swastik Bracelet For Men"};
		String [] ear_cat= {"Blossom earrings","Belkuri earrings","Round earrings","Classic Leaf Earrings","Crescent Earrings","Criscross Earrings","Flower Earrings","Oval Earrings","Sun Flower Earrings","Twirl Rarrings"};
//		List<String> chain_models = Arrays.asList(c_cat_models);
//	List<String> ring_models = Arrays.asList(ring_cat_models);
		int[] ear_cat_a= {29080,22007,22007,29080,29080,29080,29080,29080,29080,29080};
		int[] brac_cat_a= {71518,29091,57325,67981,67981,142247,354425};
		int[] ring_cat_models_a = {12878,12878,12878,12878,12878,12878,12878,12878,19178,19178,19177,19177,19178,25478,25588};
		int[] c_cat_a = { 25255, 50235, 50325, 56555, 63235, 59535, 125049 };
		List l = new LinkedList();
		
		List<int[]> asList2 = Arrays.asList(c_cat_a,ear_cat_a,brac_cat_a,ring_cat_models_a);
			
		List<String[]> asList = Arrays.asList(c_cat_models,ear_cat,brac_cat,ring_cat_models);
	for (int i = 0; i < asList.size(); i++) {
		for (String strings : asList.get(i)) {
//			System.out.println(strings);
			 int[] js = asList2.get(i);
	
			 for (int strings2 : js) {
				 if (i==1) {
					 c_cat.put(strings, strings2);
				}
				 else if (i==2) {
					 Earings_cat.put(strings, strings2);

				}
				 else if (i==3) {
					 bracelets_cat.put(strings, strings2);

					}
				 else if (i==4) {
					 ring_cat.put(strings, strings2);
					}

				 
			}
			
//		}
		
	}
	System.out.println(c_cat);
	System.out.println(Earings_cat);
	System.out.println(bracelets_cat);
	System.out.println(ring_cat);
	
//	System.out.println(asList);
		LinkedList l_price = new LinkedList();
		ArrayList l_models = new ArrayList();
//		for (int i = 0; i < c_cat_models.length; i++) {
//			l_models.add(c_cat_models[i]);
//			
//		}
//		System.out.println(l_models);
		
		
//		for (List<String> list : l) {
//			l.addAll(ring_cat_models_a);
//			l.add(c_cat_a);
//			l.add(brac_cat_a);
//			l.add(ear_cat_a);
//		}
//		
//		ll.add(l);
//		System.out.println(l);
//	for (int i = 0; i < l.size(); i++) {
//		System.out.println(l);
//	}
//		String[] split = models.split(",");
//		int j = 0;ArrayList key_set = new ArrayList();
//		Integer [] val_set = new Integer[ring_cat_models.length];
//		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
////			Object object =
////					iterator.next();
////			String string = object.toString();
//			System.out.println(iterator.next());
//		}
//		int j = 0;
//		String[][] ob={ring_cat_models,c_cat_models,brac_cat,ear_cat};
//		for (String i : ob[j]) {
//			String[] split = i.split(",");
//			String key = split[j].trim();
//			Integer value=c_cat_a[j];
//			c_cat.put(key,value );
//			j++;
//		}
//		c_cat.put("Gold Ball 18", 25255);
//		c_cat.put("Ananda 18", 50235);
//		c_cat.put("The fame 18", 50325);
//		c_cat.put("Ananda 21", 56555);
//		c_cat.put("The fame 24", 63235);
//		c_cat.put("Square chains\n 24'inch", 59535);
//		c_cat.put("Square chains\n24'inch (20)", 125049);
////		Iterator iterator = c_cat.entrySet().iterator();
////		while (iterator.hasNext()) {
////			Entry object = (Entry) iterator.next();
////			System.out.println(object.getKey()+" "+object.getValue());
////		}

		ring_cat.put("Blossom Ring 14mm", 12878);
		ring_cat.put("Classic Leaf\n  Ring 14mm\t", 12878);

		ring_cat.put("Crescent Ring 14mm", 12878);

		ring_cat.put("CrisCross Ring 14mm", 12878);

		ring_cat.put("Flower Ring 14mm", 12878);
		ring_cat.put("Sun Flower Ring 14mm", 12878);
		ring_cat.put("Twirl Ring 14mm", 12878);
		ring_cat.put("Line Ring 14mm", 12878);
		ring_cat.put("blossom Ring 16mm", 19178);
		ring_cat.put("Classic Leaf\n  Ring 16mm\t", 19178);
//		Set r_entrySet = r_cat.entrySet();
//		HashMap br_cat = new HashMap();
//		br_cat.put(r_cat, br_cat);

		ring_cat.put("Elite\n  Design Ring 14mm", 19177);
		ring_cat.put("Designer Ring 14mm", 19177);
		ring_cat.put("Flower Ring 16mm", 19178);
		ring_cat.put("oval Ring 16mm", 25478);
		ring_cat.put("Zigzag Ring 16mm", 25578);
	}}

	public static void main(String[] args) {
		GChitFund cf = new GChitFund();
		cf.customer_details();
		System.out.println("-----Types of Schemes--------");
//		ArrayList types_of_scheme = cf.types_of_scheme();
		System.out.println("select your schemes");
//		l.add(c_cat);
//		l.add(r_cat);
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		String read = "";
		try {
			read = br.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (read != " ") {
			cf.jwellery_categories();
		}
		System.out.println("PRESS the category NUMBER to see models in that category");
		gold_Scheme_review();
		try {
			read = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (read.equals("1")) {
			Set entryset = c_cat.entrySet();
			models_and_prices(entryset);
			
			
		}
		if (read.equals("2")) {
			Set entryset = Earings_cat.entrySet();
			models_and_prices(entryset);
		} if (read.equals("3")) {

			Set entryset = bracelets_cat.entrySet();
			models_and_prices(entryset);
		}
		if (read.equals("4")) {
			Set entryset = ring_cat.entrySet();
			models_and_prices(entryset);
			
		
		} else {

		}

	}

	private static void models_and_prices(Set entryset) {
		Iterator iterator = entryset.iterator();
		System.out.println("\t models" + "\t\t" + " Price(Rs)");
		while (iterator.hasNext()) {
			Entry e = (Entry) iterator.next();
			String key = (String) e.getKey();
			int value = (int) e.getValue();
//			
			if (key.contains("Ring")) {
				System.out.println("  " + key + "\t\t" + "Rs." + value);

			} else
				System.out.println("  " + key + "\t" + "\tRs." + value);

		}

	}

	private void customer_details() {
		// TODO Auto-generated method stub

		ArrayList al1 = new ArrayList();
		al1.add("customer name");
		al1.add("email");
		al1.add("phone number");
		al1.add("state");
		ArrayList al = new ArrayList();
		al.add(this.cus_name);
		al.add(this.email);
		al.add(this.phone_num);
		al.add(this.state);
		int i = 0;
		System.out.println("\nCustomer details review \n");
		while (i < al.size()) {

			System.out.println(al1.get(i) + ": " + al.get(i));
			i++;
		}
	}

	private ArrayList types_of_scheme() {
		// TODO Auto-generated method stub
		ArrayList schemes = new ArrayList();

		schemes.add("		Schemes1 \n 1.Auction Chit".concat("\n (upto 15% discoutn for EMI)"));
		schemes.add("		Schemes2 \n 2.Jewellery Plan"
				.concat("\n (Save and Borrow\n" + "with Government chit fund) \n"));

		for (Object object : schemes) {
			System.out.println(object);
		}

//		String toString{
//			return schemes;
//		}
		return schemes;
	}

	private void jwellery_categories() {
		// TODO Auto-generated method stub
//		ArrayList jewell_cat = new ArrayList();

		ArrayList variety = new ArrayList();
		variety.add("chains");
		variety.add("Earings");
		variety.add("Bracelets");
		variety.add("Ring");
		variety.add("Bangle");

		List models = variety;
//		 jewell_cat.addAll(models);
		System.out.println("categories of jwelleries");
		int i = 1;
		for (Object object : models) {

			System.out.println(i + " " + object);
			i++;
		}

	}

	private void discount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void discount_price(int price) {
		// TODO Auto-generated method stub

	}

}
