package com.springcore.SpringCoreExample;

public class Book {

	private int bId;
	
	private String bookName;
	
	private String bookAuthor;

	public void setbId(int bId) {
		System.out.println("setbId");
		this.bId = bId;
	}

	public void setBookName(String bookName) {
		System.out.println("setBookAuthor");
		this.bookName = bookName;
	}

	public void setBookAuthor(String bookAuthor) {
		System.out.println("setBookAuthor");
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
	
	
	
	
}
