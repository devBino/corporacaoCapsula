package br.com.bino.exceptions;

public class MapTesteException extends Exception {

	private String message;
	
	public MapTesteException(StringBuilder pMessage) {
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
