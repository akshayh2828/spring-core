package com.springcore.ioccontainer;

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
        Resource resource=new ClassPathResource("Config.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Book book =factory.getBean("book",Book.class);
        
    }
}
