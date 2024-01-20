package com.springcore.springpractice;

import java.awt.print.Book;

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
        System.out.println( "Hello World!" );
        Resource resource=new ClassPathResource("com/springcore/springpractice/src/main/java/com/springcore/springpractice/Config.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Book book=factory.getBean("books",Book.class);
        System.out.println(book);
        
    }
}
