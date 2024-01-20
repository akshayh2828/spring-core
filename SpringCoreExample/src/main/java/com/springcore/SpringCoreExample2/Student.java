package com.springcore.SpringCoreExample2;

public class Student {
	

	Book book;
//
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	public void GetBookClass() {
		System.out.println("getting book details inside Student class");
		System.out.println("......................");
		book.getBook();
	}
	
}
