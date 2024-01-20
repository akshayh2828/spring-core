package com.springcore.springfisrt;

public class Book 
{
private int bId;
	
	private String bookName;
	
	private String bookAuthor;

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Book(int bId, String bookName, String bookAuthor) {
		super();
		this.bId = bId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
	
	

}
