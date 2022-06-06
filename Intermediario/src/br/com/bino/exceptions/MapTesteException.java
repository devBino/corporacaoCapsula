package br.com.bino.exceptions;

public class MapTesteException extends RuntimeException {

	private static final long serialVersionUID = -5555654569131335067L;
	
	private String message;

	public MapTesteException(String pMessage) {
		message = pMessage;
	}
	
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
