package org.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo3 {
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    ArrayList marks = new ArrayList(); 

	    Scanner sc = new Scanner(System.in); 
	    while(true)
	    {
	      System.out.println("Enter mark: ");
	    int mark = sc.nextInt(); 
	    marks.add(mark); 
	    System.out.println("Enter N to stop"); 
	    char ch = sc.next().charAt(0); 
	    if(ch =='N')
	        break; 
	    }
	    int total = 0 ;
	    for (int i = 0; i < marks.size(); i++) {
			
			total=total+(int)marks.get(i);
		}
	    System.out.println(total);
	   
	  }
}
