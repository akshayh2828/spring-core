package com.springcore.SpringCoreExample6;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Course {

	private List<String> subjects;
	
	private Set<String> faculties;
	
	private Map<String,String> hod;
	
	private Properties topper;

	public  void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

//	public  void setFaculties(Set<String> faculties) {
//		this.faculties = faculties;
//	}
//
//	public  void setHod(Map<String, String> hod) {
//		this.hod = hod;
//	}
//
//	public  void setTopper(Properties topper) {
//		this.topper = topper;
//	}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + ", faculties=" + faculties + ", hod=" + hod + ", topper=" + topper
				+ "]";
	}
	
	
	
}
