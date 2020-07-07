package com.puc.sca.util.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = -467333885245388059L;

	private LocalDateTime timestamp;

	private Object[] messages;

	private String details;

	public ExceptionResponse(LocalDateTime timestamp, String details, Object... messages) {
		this.timestamp = timestamp;
		this.details = details;
		this.messages = messages;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
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
