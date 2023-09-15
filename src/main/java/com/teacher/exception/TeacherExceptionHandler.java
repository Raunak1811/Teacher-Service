package com.teacher.exception;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TeacherExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(NotNullException.class)
	public String handleNotNullException(NotNullException ex) {
		return ex.getMessage();
	}


	/*@ExceptionHandler(TeacherNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleTeacherNotFound(TeacherNotFoundException ex){
		ErrorMessage message = new ErrorMessage(new Date(),
				           HttpStatus.NOT_FOUND.value(),
				           HttpStatus.NOT_FOUND.getReasonPhrase(),
				           ex.getMessage());
		return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	}*/
	
	@ExceptionHandler(TeacherNotFound.class)
	public ResponseEntity<Object> handleTeacherNotFound(TeacherNotFound ex, WebRequest request){
		return new ResponseEntity<>(new ApiError(ex.getMessage(),
									HttpStatus.NOT_FOUND,
									LocalDateTime.now()),
									HttpStatus.NOT_FOUND);
	}
	
	}