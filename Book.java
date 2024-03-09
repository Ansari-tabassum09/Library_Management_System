package com.jsp.lms_model;


public class Book {

	private String BookName;
	private String Author;
	private double BookPrice;
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [BookName=" + BookName + ", Author=" + Author + ", BookPrice=" + BookPrice + "]";
	}
	
	
	
	
	

	
}
