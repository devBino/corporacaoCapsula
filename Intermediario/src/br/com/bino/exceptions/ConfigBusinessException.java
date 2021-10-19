package br.com.bino.exceptions;

public class ConfigBusinessException extends Exception {

	private String message;
	
	public ConfigBusinessException(StringBuilder pMessage) {
		message = pMessage.toString();
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return message;
	}
	
}
