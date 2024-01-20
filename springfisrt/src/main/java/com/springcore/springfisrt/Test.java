package com.springcore.springfisrt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		System.out.println("hello");
		Resource resource=new ClassPathResource("com/springcore/springfisrt/Config.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Book book1=factory.getBean("book",Book.class);
		System.out.println(book1.toString());
	}

}
