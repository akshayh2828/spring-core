package com.springcore.SpringCoreExample5;

import java.util.List;
import java.util.Set;

public class Course {

	private List<String> subjects;
	
	private Set<String> faculties;

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public Course(Set<String> faculties) {
		this.faculties=faculties;
	}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + ", faculties=" + faculties + "]";
	}
	
	
	
}
