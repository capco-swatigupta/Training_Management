package com.capco.trainingmanagement.microservice.exceptions;

import org.springframework.http.HttpStatus;

public class BaseException extends Exception{

private static final long serialVersionUID = 1L;
	
	private final HttpStatus status;
	
    public BaseException(String message, HttpStatus status) {
	    super(message);
	    this.status = status;
	}

	public HttpStatus getStatus() {
	    return status;
	}
}
