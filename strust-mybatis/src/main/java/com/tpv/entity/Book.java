package com.tpv.entity;

public class Book {
	private String bookId;
	private String bookName;
	private String description;
	private String avatar;
	private double price;
	private String authorName;
	private String topicId;
	
	
	public Book() {
		
	}
	
	public Book(String bookId, String bookName, String description, String avatar, double price, String authorName,
			String topicId) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.description = description;
		this.avatar = avatar;
		this.price = price;
		this.authorName = authorName;
		this.topicId = topicId;
	}

	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	
	
}
