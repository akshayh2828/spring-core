package com.springcore.beanScopeProto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("proto")
@Scope("prototype")
public class Proto1 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Proto1 [name=" + name + "]";
	}
	
	
	

}
