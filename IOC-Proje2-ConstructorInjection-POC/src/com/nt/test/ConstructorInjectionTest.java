package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	 

		public static void main(String[] args) {
			 BeanFactory factory=null;
			 WishMessageGenerator generator=null;
		//	 Object obj=null;
			 Date date=null;
			 //create BeanFactory IOC container
			//factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
			// factory=new XmlBeanFactory(new ClassPathResource("src/com/nt/cfgs/applicationContext.xml"));
			factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
			 //get Target Bean class object
		  generator=factory.getBean("wmg",WishMessageGenerator.class);
			 
			 //invoke b.method
			 System.out.println("result:::"+generator.generateMessage("raja"));
		}
	}



