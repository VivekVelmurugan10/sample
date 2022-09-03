package org.hcl;
	public class Child extends Constructorsuper{
		Child(){
			super();
			System.out.println("child class constructor");
			
		}
		Child(int id){
			super(5);
			System.out.println("child class with arguments");
		}

		public static void main(String[] args) {
			Child c = new Child();
			Child c1 = new Child(5);
		}
}
