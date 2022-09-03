package org.hcl;
// implement the Polygon interface
public class Interface implements Polygon {
	


		  // implementation of abstract method
		  public void getArea(int length, int breadth) {
		    System.out.println("The area of the rectangle is " + (length * breadth));
		  }
		

	 public static void main(String[] args) {
			  Interface r1 = new Interface();
		    r1.getArea(5, 6);
		  }
		}


