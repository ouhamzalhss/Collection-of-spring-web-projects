package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestAdvice {

	@ExceptionHandler
	public ResponseEntity<MyErrorResponse> exceptionHandler(MyException exception){
		MyErrorResponse errorResponse = new MyErrorResponse();
		errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}	
	@ExceptionHandler
	public ResponseEntity<MyErrorResponse> exceptionHandler(Exception exception){
		MyErrorResponse errorResponse = new MyErrorResponse();
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
	}
}
