package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTestUsingDLBF {
public static void main(String[]args) {
	DefaultListableBeanFactory pFactory=null,cFactory=null;
XmlBeanDefinitionReader pReader=null,cReader=null;
MainController controller=null;
List<EmployeeDTO>listDTO=null;

//create ParentContainer
	pFactory=new DefaultListableBeanFactory();
	pReader=new XmlBeanDefinitionReader(pFactory);
	pReader.loadBeanDefinitions("src/main/java/com/nt/cfgs/business-beans.xml");
	//create child
	
	cFactory=new DefaultListableBeanFactory();
	cReader=new XmlBeanDefinitionReader(cFactory);
	cReader.loadBeanDefinitions("src/main/java/com/com/nt/cfgs/presentation-beans.xml");
	//get Controller class object
	
	controller=cFactory.getBean("controller",MainController.class);
	try {
		//invoke method
		listDTO=controller.fetchEmployeesByDesgs(new String[] {"CLERK","MANAGER","SALESMAN"});
		listDTO.forEach(dto->{
			System.out.println( dto);
			
		});
	 }
	catch (Exception e) {
		System.out.println("Internal Problem---");
		e.printStackTrace();
	}
	System.out.println("............................................");
	try {
		//invoke method
		listDTO=controller.fetchEmployeesByDesgs(new String[] {"CLERK","MANAGER"});
		listDTO.forEach(dto->{
			System.out.println(dto);
		});
		}
		catch (Exception e) {
			System.out.println("Internal Problem---");
			e.printStackTrace();
		}
	
}
}
