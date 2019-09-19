 package com.revature.grading.exception;

public class DBException extends Exception {

//	public DBException(String message) {
//		super(message);
//	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DBException(String message) {
		super(message);
	}

	public DBException(String message, Throwable t) {
		super(message, t);
	}
}
