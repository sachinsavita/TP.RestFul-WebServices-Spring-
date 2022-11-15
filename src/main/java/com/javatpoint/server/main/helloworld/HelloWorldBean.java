package com.javatpoint.server.main.helloworld;

public class HelloWorldBean {
	
	public String message;
	
	
	//Constructor
	public HelloWorldBean(String message)
	{
		this.message = message;
	}
	
	//Getters and Setters
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage()
	{
		this.message = message;
	}

	//Generating toString method
	public String toString()   
	{  
	return String.format ("HelloWorldBean [message=%s]", message);  
	}  
}
