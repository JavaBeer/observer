package br.com.javabeer.design.observer;

public class Notification {
	
	private String type;
	private String message;
	
	public Notification(String type, String message) {
		super();
		this.type = type;
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}
	
}
