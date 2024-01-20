package com.springcore.beanScopeProto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanScopeProto/Config.xml");
	Proto1 p1=	context.getBean("proto",Proto1.class);
	p1.setName("akshay");
	System.out.println(p1.getName());
	Proto1 p2=context.getBean("proto",Proto1.class);
	System.out.println(p2.getName());
	}

}
