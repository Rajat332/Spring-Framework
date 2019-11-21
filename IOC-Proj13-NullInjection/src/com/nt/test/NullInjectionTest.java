package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.PersonProfile;

public class NullInjectionTest {
public static void main(String[]args) {
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	PersonProfile profile=null;
	
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
	profile=factory.getBean("pandya",PersonProfile.class);
	System.out.println(profile);
	
}
}
