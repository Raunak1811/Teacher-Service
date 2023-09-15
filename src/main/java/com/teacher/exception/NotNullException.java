package com.teacher.exception;

public class NotNullException extends Exception {

		private static final long serialVersionUID = 1L;
		
		public String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public NotNullException(String message) {
			super(message);
		}

}

