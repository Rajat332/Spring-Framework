package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.CricketBat;
import com.nt.beans.ProffessionalCricketer;

public class InnerBeanTest {
	public static void main(String[] args) {
		   DefaultListableBeanFactory factory=null;
		   XmlBeanDefinitionReader reader=null;
		   ProffessionalCricketer pfCk=null;
		   CricketBat bat=null;
		   //create IOC container
		   factory=new DefaultListableBeanFactory();
		   reader=new XmlBeanDefinitionReader(factory);
		   reader.loadBeanDefinitions("com/nt/cfgs/applicatonContext.xml");
		   //get Taget Bean class obj
		   pfCk=factory.getBean("Rohit",ProffessionalCricketer.class);
		   System.out.println(pfCk);
		 //get Inner Bean class obj
		   bat=factory.getBean("ckBat",CricketBat.class);
		   System.out.println(bat);
		   
		}
	


}
