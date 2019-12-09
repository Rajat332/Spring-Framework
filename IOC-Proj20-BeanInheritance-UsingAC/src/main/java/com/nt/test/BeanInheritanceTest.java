package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Bike;

public class BeanInheritanceTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Bike bike1=null,bike2=null;
		//create IOc container
		//ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target class object
		bike1=ctx.getBean("pulsor1",Bike.class);
		System.out.println(bike1);
		System.out.println("--------------------------------");
		bike2=ctx.getBean("pulsor2",Bike.class);
		System.out.println(bike2);
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}



}
