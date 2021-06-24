package com.synechron.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapper {

	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<String> handleNoDataFoundException(Exception e) {
		String message = e.getMessage();
		return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
	}

}
