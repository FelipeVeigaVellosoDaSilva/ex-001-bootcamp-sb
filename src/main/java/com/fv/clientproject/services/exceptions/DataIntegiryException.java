package com.fv.clientproject.services.exceptions;

public class DataIntegiryException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DataIntegiryException(String msg) {
		super(msg);
	}
	
	public DataIntegiryException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
