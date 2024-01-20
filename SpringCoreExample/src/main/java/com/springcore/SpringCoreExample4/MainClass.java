package com.springcore.SpringCoreExample4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/springcore/SpringCoreExample4/Config.xml"));
		
		Bike bike= factory.getBean("bike", Bike.class);
		
		Oil oil= factory.getBean("oil", Oil.class);
		
	}
}
