package com.springcore.SpringCoreExample5;

import java.util.Map;
import java.util.Properties;

public class College {

	private Map<String, Course> hodToCourse;
	
	private Properties courseTopper;

	

	public  void setHodToCourse(Map<String, Course> hodToCourse) {
		this.hodToCourse = hodToCourse;
	}

	public void setCourseTopper(Properties courseTopper) {
		this.courseTopper = courseTopper;
	}

	@Override
	public String toString() {
		return "College [hodToCourse=" + hodToCourse + ", courseTopper=" + courseTopper + "]";
	}
	
	
	
}
