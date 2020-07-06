package com.puc.sca.util.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	

	private static final long serialVersionUID = -467333885245388059L;

	private Date timestamp;
	
	private Object[] messages;
	
	private String details;
	
	public ExceptionResponse(Date timestamp, String details, Object ... messages) {
		this.timestamp = timestamp;
		this.details = details;
		this.messages = messages;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public Object[] getMessages() {
		return messages;
	}
	
	public void setMessages(Object[] messages) {
		this.messages = messages;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	
}
