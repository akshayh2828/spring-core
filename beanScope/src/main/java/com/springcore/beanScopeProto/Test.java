package com.springcore.beanScopeProto ;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanScopeProto/Config.xml");
	PrototypeScope p=context.getBean("protoType", PrototypeScope.class);
    PrototypeScope p1=context.getBean("protoType",PrototypeScope.class);
    System.out.println(p);
    System.out.println(p1);
    if(p==p1)
    {
    	System.out.println("p and p1 are same");
    }
    else
    {
    	System.out.println("p and p1 are not same");
    }
	
		
	}
	

}
