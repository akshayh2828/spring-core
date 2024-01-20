package com.springcore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context=new ClassPathXmlApplicationContext(" com/springcore/beanScope/Config.xml");
        SingletonDemo obj1=context.getBean("singleTon",SingletonDemo.class);
        SingletonDemo obj2=context.getBean("singleTon",SingletonDemo.class);
        System.out.println(obj1);
        System.out.println(obj2);
        if(obj1==obj2)
        {
        	System.out.println("both are same");
        }
    }
}
