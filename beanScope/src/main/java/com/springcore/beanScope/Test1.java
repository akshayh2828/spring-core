package com.springcore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(" com/springcore/beanScope/Config.xml");
       SingleTon1 s1= context.getBean("singleTon1",SingleTon1.class);
       s1.setName("akshay");
       System.out.println(s1.getName());
       SingleTon1 s2=context.getBean("singleTon1",SingleTon1.class);
       System.out.println(s2.getName());
	}

}
