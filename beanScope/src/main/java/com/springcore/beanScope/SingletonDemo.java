package com.springcore.beanScope;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singleTon")
//@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON) this is standard way to write
@Scope("singleton")
public class SingletonDemo
{

}
