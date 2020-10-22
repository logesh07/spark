package com.starBazzar.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
	@ExceptionHandler(CustomeErrorConfig.class)
	public ResponseEntity<Object> mymessage (CustomeErrorConfig e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
//	
//	@ExceptionHandler(UnhandledException.class)
//	public ResponseEntity<Object> unhandlesException (errorScenario e)
//	{
//		HttpStatus status = HttpStatus.BAD_REQUEST;
//		return  ResponseEntity.status(status).body(e);
//	}
//	
}
