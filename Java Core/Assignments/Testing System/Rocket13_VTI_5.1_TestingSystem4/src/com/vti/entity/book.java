package com.vti.entity;

public class book extends document {
	private String author;
	private int page;

	public book(int id, String publisherName, int releaseNumber, String author, int page) {
		super(id, publisherName, releaseNumber);
		this.author = author;
		this.page = page;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString()+" [author=" + author + ", page=" + page + "]";
	}
	
}
