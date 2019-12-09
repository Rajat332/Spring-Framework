package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Tournament;

public class AutoWiringTest {

	public static void main(String[] args) {
		 DefaultListableBeanFactory factory=null;
		   XmlBeanDefinitionReader reader=null;
		   Tournament tournament;
			//create IOC container+
		   factory=new DefaultListableBeanFactory();
		   reader=new XmlBeanDefinitionReader(factory);
		   reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		   //get Bean class object
		 tournament=factory.getBean("trmnt",Tournament.class);
		 System.out.println(tournament);
			/*
			 * System.out.println("-----------------");
			 * tournament=factory.getBean("trmnt1",Tournament.class);
			 * System.out.println(tournament);
			 */	   
		   
}
}