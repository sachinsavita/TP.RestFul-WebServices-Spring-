package com.javatpoint.server.main.exception;

public class ExceptionResponse {

	private String timeStamp;
	private String message;
	private String detail;

	public ExceptionResponse(String timeStamp, String message, String detail) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.detail = detail;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetail() {
		return detail;
	}
	
	

}