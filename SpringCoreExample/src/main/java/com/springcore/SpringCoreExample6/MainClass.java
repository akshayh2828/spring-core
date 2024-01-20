package com.springcore.SpringCoreExample6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/springcore/SpringCoreExample6/Config.xml"));
	Course  c=  factory.getBean("firstSemCourse", Course.class);
	System.out.println(c);
	}
}
