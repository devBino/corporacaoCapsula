package br.com.bino.avancado.exceptions;

import br.com.bino.avancado.constants.enums.Erro;

public class BinoException extends RuntimeException {

	private static final long serialVersionUID = 8916406990255509064L;
	
	private String message;
	
	public BinoException() {
		message = null;
	}
	
	public BinoException(Erro e) {
		message = e.getError();
	}
	
	public void setMessage(String pMessage) {
		message = pMessage;
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
