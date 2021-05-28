package com.vti.entity;

import java.time.Month;

public class Journal extends document{
	private int issueNumber; //số phát hành
	private int releaseMonth; //tháng phát hành
	public Journal(int id, String publisherName, int releaseNumber, int issueNumber, int releaseMonth) {
		super(id, publisherName, releaseNumber);
		this.issueNumber = issueNumber;
		this.releaseMonth = releaseMonth;
	}
	
	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	@Override
	public String toString() {
		return super.toString()+ " [issueNumber=" + issueNumber + ", releaseMonth=" + releaseMonth + "]";
	}
	
}
