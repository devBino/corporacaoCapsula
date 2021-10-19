package br.com.bino.exceptions;

public class DivisaoPorZeroException extends Exception {

	private String mensagem;
	
	public DivisaoPorZeroException(String pMensagem) {
		mensagem = pMensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	@Override
	public String toString() {
		return mensagem;
	}
	
}