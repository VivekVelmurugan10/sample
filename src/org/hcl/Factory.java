package org.hcl;
//child
public class Factory extends Client {
	public void labourName() {
		System.out.println("gffef");

	}
	
	public static void main(String[] args) {
		Factory s= new Factory();
		s.labourName();
		s.clientName();
		s.employeeName();
	}

}
