package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class BeanCollabarationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		fpkt=factory.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.shopping(new String[] {"shirt","trouser", "sweets","crackers"},
				                                                        new float[] {2000,3000,1000,5000}));
		
	}

}


