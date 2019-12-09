package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVotingElgiblity;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		
		CheckVotingElgiblity voting=null;
		
		//Create IOC Container
ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

voting=ctx.getBean("cve",CheckVotingElgiblity.class);

System.out.println(voting.checkVotingElgibility());
	
System.out.println(voting);
	
//Close Container
((AbstractApplicationContext)ctx).close();
	}

}
