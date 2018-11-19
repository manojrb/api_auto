package com.automation.utilities;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.testng.Reporter;

public class TestNGAppender extends AppenderSkeleton {

	public void close() {
		
	}

	public boolean requiresLayout() {
		return true;
	}

	@Override
	protected void append(LoggingEvent event) {
		Reporter.log(eToS(event));
	}
	
	private String eToS(LoggingEvent event) {
		Object message = event.getMessage();
		if(message instanceof String) {
			return (String) message;
		}
		return null;
	}

}
