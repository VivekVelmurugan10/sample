package org.hcl;

import java.util.HashMap;
import java.util.Map;


public class map {
	public static void main(String[] args) {
		
	
 Map<Integer,Integer> mi= new HashMap<Integer,Integer>();
 
 mi.put(1,3);
 mi.put(3,4);
 mi.put(2,3);
 mi.put(6,7);
 for (Integer name : mi.keySet()) 
     System.out.println("key: " + name);
   
 // using values() for iteration over values
 for (Integer i : mi.values()) 
     System.out.println("value: " + i);
 }

}


