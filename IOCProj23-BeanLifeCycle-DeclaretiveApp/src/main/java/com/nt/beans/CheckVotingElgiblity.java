package com.nt.beans;

import java.util.Date;

public class CheckVotingElgiblity {
private String name;
private byte age;
private String  addrs;
private Date sysDate;

public CheckVotingElgiblity() {
	System.out.println("CheckVotingElgiblity::0-param constructor");


}

public void setName(String name) {
	System.out.println("CheckVotingElgiblity.setName(-)");
	this.name = name;
}

public void setAge(byte age) {
	System.out.println("CheckVotingElgiblity.setAge(-)");
	this.age = age;
}

public void setAddrs(String addrs) {
	System.out.println("CheckVotingElgiblity.setAddrs(-)");
	this.addrs = addrs;
}

public void myInit() {
	System.out.println("CheckVotingElgiblity.myInit()");
sysDate=new Date();
if(name==null || age<=0)
	throw new IllegalArgumentException("Invalid inputs");
}
public void myDestroy() {
	System.out.println("CheckVotingElgiblity.myDestroy()");
	name=null;
	addrs=null;
	age=0;
	sysDate=null;
}
//method
public String checkVotingElgibility() {
	if(age>=-300)
		return "Mr/Miss/Mrs."+name+"You Are Elgible For Voting";
	else
		return "Mr/Miss/Mrs."+name+"You Are Not Elgible For Voting";
	
	
}

@Override
public String toString() {
	return "CheckVotingElgiblity [name=" + name + ", age=" + age + ", addrs=" + addrs + ", sysDate=" + sysDate + "]";
}

}