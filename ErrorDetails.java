package com.example.exception;

import java.util.Date;

public class ErrorDetails {
	private Date date;
	public ErrorDetails(Date date, String message, String details) {
		super();
		this.date = date;
		this.message = message;
		this.details = details;
	}

	private String message;
	private String details;
	
	public Date getDate() {
		return date;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getDetails() {
		return details;
	}
	
	
	

}
