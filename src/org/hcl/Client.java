package org.hcl;
//parent
public class Client extends Company {
	public void clientName() {
		System.out.println("xyz");

	}
public static void main(String[] args) {
	Client c=new Client();
	c.clientName();
	c.employeeName();
	
}
}
