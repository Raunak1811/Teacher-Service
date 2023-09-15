package com.teacher.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorMessage {
	
	private Date timestamp;
	
	private int statuscode;
	
	private String error;
	
	private String message;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorMessage [timestamp=" + timestamp + ", statuscode=" + statuscode + ", error=" + error + ", message="
				+ message + "]";
	}

	public ErrorMessage(Date timestamp, int statuscode, String error, String message) {
		super();
		this.timestamp = timestamp;
		this.statuscode = statuscode;
		this.error = error;
		this.message = message;
	}

	public ErrorMessage() {
		super();
	}

}
