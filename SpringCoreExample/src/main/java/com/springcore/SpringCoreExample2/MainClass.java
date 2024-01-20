package com.springcore.SpringCoreExample2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		
		Resource res= new ClassPathResource("com/springcore/SpringCoreExample2/config.xml");
		
		BeanFactory factory= new XmlBeanFactory(res);
		System.out.println(factory);
		System.out.println("..............");
		Student student=factory.getBean("student", Student.class);
		
		student.GetBookClass();
	}
	
}
