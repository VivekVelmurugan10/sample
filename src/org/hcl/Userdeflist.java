package org.hcl;

import java.util.ArrayList;
import java.util.Scanner;

public class Userdeflist {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> LIST = new ArrayList<Integer>();
	
	while (sc.hasNextInt()) 
	{
		int i = sc.nextInt();
	    LIST.add(i);
	    System.out.println(LIST);
	}
}
}
