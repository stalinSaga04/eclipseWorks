package org.string;

public class StringDemo1 {
	public static void main(String[] args) {
		String last_movie1 = "GN";
		String last_movie2 = "GN";
		String last_movie3 = "GN";
		String last_movie4 = "GN";
		System.out.println(last_movie1.hashCode());
		System.out.println(last_movie2.hashCode());
		System.out.println(last_movie3.hashCode());
		System.out.println(last_movie4.hashCode());
		last_movie1 = "2018";
		System.out.println(last_movie1.hashCode());
		System.out.println(last_movie2.hashCode());
		System.out.println(last_movie3.hashCode());
		System.out.println(last_movie4.hashCode());
		String name = "sabaribala";
		StringDemo1 sd = new StringDemo1();
		sd.starts_with();
		sd.ends_with();
		sd.split();
		/*
		 * System.out.println(name.charAt(0)); System.out.println(name.charAt(1));
		 * System.out.println(name.charAt(2)); System.out.println(name.charAt(3));
		 * System.out.println(name.charAt(4)); System.out.println(name.charAt(5));
		 */
		System.out.println(name.length());
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a') {
				System.out.print(name.charAt(i));
			}

		}
		System.out.println();
		System.out.println(name.charAt(name.length() / 2)); 
		}// print mid letter
	

	private void split() {
		// TODO Auto-generated method stub
		String s  = "IPL Ended Yesterday";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			
		}
		
	}
	private void ends_with() {
		// TODO Auto-generated method stub
		String name1 = "sabaribala";
		String name2 = "bala";
		boolean ends = true;
		int len1 = name1.length()-1; 
		for(int len2 = name2.length()-1; len2>=0;len2--)
		{
		  if(name1.charAt(len1)== name2.charAt(len2))
		  {
		    len1--;
		    continue; 
		  }
		  else
		  {
		    System.out.println("No, not ends with");
		    ends = false; 
		    break; 
		  }
		}  
		if(ends == true)
		{
		  System.out.println("yes, ends with "+name2);
		}
		  
	}

	private void starts_with() {
		// TODO Auto-generated method stub
		String name = "sabaribala";
		String name2 = "sa";
		boolean st = true;
	
		for (int i = 0; i < name2.length(); i++) {
		if (name.charAt(i)==name2.charAt(i)) {
			continue;
		}
		else {
			st  = false;
			break;
		}
		}
		if (st==true) {
			System.out.println(name+ " YES starts with "+name2);
		}
		else {
			System.out.println(name+ "NOT starts with "+name2);
		}
	}
}
