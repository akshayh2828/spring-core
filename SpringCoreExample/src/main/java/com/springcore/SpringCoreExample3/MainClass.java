package com.springcore.SpringCoreExample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	
	public static void main(String[] args) {
		
		Resource res= new ClassPathResource("com/springcore/SpringCoreExample3/Config.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	
	Drive drive= factory.getBean("drive",Drive.class);
	
	System.out.println(drive.startCar());
		
	}
}
