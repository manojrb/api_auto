package com.automation.exceptions;


/**
 * @author manoj
 *
 */
public class WebserviceException extends Exception {

	private static final long serialVersionUID = 1L;

	public WebserviceException() {
	}

	public WebserviceException(String message) {
		super(message);
	}

	public WebserviceException(Throwable cause) {
		super(cause);
	}

	public WebserviceException(String message, Throwable cause) {
		super(message, cause);
	}

	public WebserviceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

