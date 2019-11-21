package com.nt.beans;

public class ProffessionalCricketer {
   private String name;
   private byte jersyNo;
   private CricketBat bat;
   
  public ProffessionalCricketer(String name,CricketBat bat) {
	  System.out.println("ProffessionalCricketer.2-param constructor");
  this.name=name;
  this.bat=bat;
  }
  public void setJersyNo(byte jersyNo) {
	 System.out.println("ProffessionalCricketer.setJersyNo(-)"); 
  this.jersyNo=jersyNo;
  }
@Override
public String toString() {
	return "ProffessionalCricketer [name=" + name + ", jersyNo=" + jersyNo + ", bat=" + bat + "]";
}
  
  
}
