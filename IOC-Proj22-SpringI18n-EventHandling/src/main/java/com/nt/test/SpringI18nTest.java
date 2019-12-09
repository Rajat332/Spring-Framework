package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public interface SpringI18nTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale=null;
		String msg1=null,msg2=null,msg3=null,msg4=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null;
		//create  IOC container
		ctx=new  ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//create Locale object
		locale=new Locale(args[0],args[1]);
		msg1=ctx.getMessage("screen.title",new Object[] {"student"}, "message1",locale);
		msg2=ctx.getMessage("btn1.cap",new Object[] {}, "caption1",locale);
		msg3=ctx.getMessage("btn2.cap",new Object[] {}, "caption2",locale);
		msg4=ctx.getMessage("btn3.cap",new Object[] {}, "caption3",locale);
		System.out.println(ctx.getMessage("screen.title", new Object[] {"customer"}, "cap2", new Locale("fr","FR")));
		//close container
		((AbstractApplicationContext) ctx).close();
		//prepare Frame window
		frame=new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setTitle(msg1);
		frame.setSize(200,200);
		//add comps
		btn1=new JButton(msg2);
		btn2=new JButton(msg3);
		btn3=new JButton(msg4);
		frame.add(btn1);frame.add(btn2); frame.add(btn3);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
	}//main
}//class

