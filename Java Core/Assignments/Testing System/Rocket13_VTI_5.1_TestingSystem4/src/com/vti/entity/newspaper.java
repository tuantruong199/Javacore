package com.vti.entity;

import java.time.MonthDay;

public class newspaper extends document{
	private int releaseDate; //Ngày phát hành

	public newspaper(int id, String publisherName, int releaseNumber, int day) {
		super(id, publisherName, releaseNumber);
		this.releaseDate = day;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return super.toString()+ " [releaseDate=" + releaseDate + "]";
	}
	
}
