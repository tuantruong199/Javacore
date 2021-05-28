package com.vti.entity;

public abstract class document {
	private int id;
	private String publisherName; //Tên nhà xuất bản
	private int  releaseNumber; //Số bản phát hành
	public document(int id, String publisherName, int releaseNumber) {
		super();
		this.id = id;
		this.publisherName = publisherName;
		this.releaseNumber = releaseNumber;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "document [id=" + id + ", publisherName=" + publisherName + ", releaseNumber=" + releaseNumber + "]";
	}
}
