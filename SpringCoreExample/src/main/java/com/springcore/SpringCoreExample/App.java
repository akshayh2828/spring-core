package com.springcore.SpringCoreExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Resource resource= new ClassPathResource("com/springcore/SpringCoreExample/config.xml");
    	BeanFactory factory= new XmlBeanFactory(resource);
    	System.out.println("Bean Factory::"+factory);
    	Book book = factory.getBean("book", Book.class);
    	
    	System.out.println(book.toString());
    }
}
