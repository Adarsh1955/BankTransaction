package com;

public class InsufficientBalanceException extends RuntimeException
{
	private String message;

	InsufficientBalanceException(String message)
	{
		this.message=message;
	}

	@Override
	public String getMessage()
	{
		return message;
	}

}


//Rules for creating custom exception
//1=create a class with the custom name
//2a=if a class extends exception --> checked exception
//2b=if a class extends runtime exception --> unchecked exception
//3=override getMessage()==>variable ,constructor and method.
//4=invoke the exception using throw keyword and handle it using try and catch block.
