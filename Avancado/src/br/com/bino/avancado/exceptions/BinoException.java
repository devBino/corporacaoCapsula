package br.com.bino.avancado.exceptions;

import br.com.bino.avancado.constants.enums.Erro;

public class BinoException extends Exception {

	private String message;
	
	public BinoException(Erro e) {
		message = e.getError();
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
