package com.nt.beans;

import java.util.Arrays;
import java.util.Random;


public class Flipkart {
	private BlueDart dart1;

	private  BlueDart dart;
		private  DTDC  dtdc;
		
		public Flipkart(DTDC dtdc) {
			this.dtdc=dtdc;
			System.out.println("Flipkart:1-param constructor");
	
		}
		 public Flipkart(BlueDart dart) {
				this.dart1=dart;
				System.out.println("Flipkart:1-param constructor");
			}
		
		public  String   shopping(String[] items,float[] prices) {
			  float billAmt=0.0f;
			  String msg=null;
			  int oid=0;
			  
			  for(float price:prices)
				    billAmt=billAmt+price;
			  
			  oid=new Random().nextInt(1000);
			  
			 //msg=dtdc.deliver(oid);
			  msg=dart1.deliver(oid);
			  return  Arrays.toString(items)+" are shopped having prices"+Arrays.toString(prices)+" with bill Amt::"+billAmt+" Delivery status::"+msg;
		}

}
