package org.hcl;

public class Methodoverriding extends MethodOverloading{
	
	@Override
	public void tes(int age) {
		System.out.println(age);
	}
	

	public static void main(String[] args) {
		Methodoverriding s= new Methodoverriding();
		s.tes(24);
	}

}
