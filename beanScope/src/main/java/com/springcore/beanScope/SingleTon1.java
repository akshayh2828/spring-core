package com.springcore.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("singleTon1")
@Scope("singleton")
public class SingleTon1 {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "SingleTon1 [name=" + name + ", id=" + id + "]";
	}
	

}
