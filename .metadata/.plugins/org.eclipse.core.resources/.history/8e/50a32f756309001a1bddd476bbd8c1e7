package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Person {
private String beanId;

public Person(String beanId) {
	System.out.println("Person.1-param constructor");
	
	this.beanId = beanId;	
}
public void eating() {
	System.out.println("Person:eathing");
	}

public void dancing() {
	System.out.println("Person:dancing");
	}


public void officeWork() {
	System.out.println("Person:Doing Local Office work");
	}


public void travellingToUSA() {
	System.out.println("Person.travellingToUSA()");
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	USVisa visa=null;
	//create IOC container for Dependency Lookup
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	//get Dependent  Bean class object using Dependency lookup
	visa=factory.getBean("visa2",USVisa.class);
	if(visa.isApproved())
		System.out.println("USA Visa is approved--> Going to USA for Vacation and OfficeWork");
	else
		System.out.println("USA Visa is not approved--> Decided Stayback  in india  to eat  GolGappa");


}
}

	
	
	
	
	
	