package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.beans.factory.BeanFactory;

public class SpringI18nTestWithBF {
	

		public static void main(String[] args) {
			BeanFactory factory=null;
			Locale locale=null;
			String msg1=null,msg2=null,msg3=null,msg4=null;
			JFrame frame=null;
			JButton btn1=null,btn2=null,btn3=null;
			//create  IOC container
			factory=new XmlBeanFactory(new ClassPathResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
			//create Locale object
			locale=new Locale(args[0],args[1]);
		/*	msg1= factory.getMessage("screen.title",new Object[] {"student"}, "message1",locale);
			msg2=factory.getMessage("btn1.cap",new Object[] {}, "caption1",locale);
			msg3=factory.getMessage("btn2.cap",new Object[] {}, "caption2",locale);
			msg4=factory.getMessage("btn3.cap",new Object[] {}, "caption3",locale);
			System.out.println(factory.getMessage("screen.title", new Object[] {"customer"}, "cap2", new Locale("fr","FR"))) ;*/
			//close container
			//((AbstractApplicationContext) ctx).close();
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


