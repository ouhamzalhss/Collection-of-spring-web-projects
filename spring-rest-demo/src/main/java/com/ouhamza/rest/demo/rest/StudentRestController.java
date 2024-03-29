package com.ouhamza.rest.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestController {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> exceptionHandler(StudentNotFoundException exception){
		StudentErrorResponse errorResponse = new StudentErrorResponse();
		errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> exceptionHandler(Exception exception){
		StudentErrorResponse errorResponse = new StudentErrorResponse();
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
	}
}
