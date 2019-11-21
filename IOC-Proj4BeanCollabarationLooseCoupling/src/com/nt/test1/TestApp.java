package com.nt.test1;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class TestApp {
	
	public static void main(String[]args) {
		
	FactoryBean factory=null;
	
	Flipkart fpkt=null;
	//IOC container
	factory=(FactoryBean) new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/ApplicationContext.xml"));
	
	//get target class object
	fpkt=((DefaultListableBeanFactory) factory).getBean("fpkt",Flipkart.class);
	//invoke method
	
	System.out.println(fpkt.shopping(new String[] {"shirt","trouser", "sweets","crackers"},
            new float[] {2000,3000,1000,5000}));
	
	}

}
