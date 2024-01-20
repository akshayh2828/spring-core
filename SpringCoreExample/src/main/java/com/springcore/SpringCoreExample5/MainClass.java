package com.springcore.SpringCoreExample5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		 
		
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/springcore/SpringCoreExample5/Config.xml"));
//	Course course=factory.getBean("cSc", Course.class);
//	System.out.println(course);
	
		College college=factory.getBean("nit", College.class);
		
		System.out.println(college);
	}
}
