package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.Printer;

public class BeansScopesTest {

	public static void main(String[] args) {
	DefaultListableBeanFactory factory=null;
XmlBeanDefinitionReader reader=null;

Person per1=null,per2=null;
Printer pntr1=null,pntr2=null;
//create IOC container for Dependency Lookup
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");	
	//get Bean objs
	per1=factory.getBean("per",Person.class);
	per2=factory.getBean("per",Person.class);
	System.out.println(per1.hashCode()+"  "+per2.hashCode());
	System.out.println("per1==per2?"+(per1==per2));
	System.out.println("----------------------------------------------");
	pntr1=factory.getBean("pntr",Printer.class);
	pntr2=factory.getBean("pntr",Printer.class);
	System.out.println(pntr1.hashCode()+"  "+pntr2.hashCode());
	System.out.println("pntr1==pntr2?"+(pntr1==pntr2));
	

}//main
	}


