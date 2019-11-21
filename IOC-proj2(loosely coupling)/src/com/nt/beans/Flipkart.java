package com.nt.beans;

import java.util.Random;

public class Flipkart {
private Courier courier;
public Flipkart() {
	System.out.println("Flipkart:o-param consrtuctor");
}
//setter method for setter injection
public void setCourier(Courier courier) {
	System.out.println("Flipkart:setCourier(-)");
	this.courier=courier;
	
}
public String purchase(String items[]) {
	//generate order id
	Random rad=new Random();
int oid=rad.nextInt(70000);
//deliver order
String status=courier.deliver(oid);

	
	return status+"Bill Amt for id"+oid+" is 7000";
}
}
